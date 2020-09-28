package cn.kgc.ssm.controller;

import cn.kgc.ssm.pojo.Books;
import cn.kgc.ssm.pojo.Users;
import cn.kgc.ssm.service.BooksService;
import cn.kgc.ssm.service.UsersService;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.awt.print.Book;
import java.util.HashMap;
import java.util.Map;

/**
 * @author 李锡良
 * @create 2020-09-28 8:57
 */
@Controller
public class UserController {

    @Resource
    UsersService usersService;

    @Resource
    BooksService booksService;

    @RequestMapping("/")
    public String toLogin(){
        return "/jsp/login";
    }

    @RequestMapping("/doLogin")
    public String doLogin(String usercode, String password, Model model, HttpSession session){
        Users users = usersService.uLogin(usercode);
        if (users==null){
            model.addAttribute("error","用户名不存在");
            return "/jsp/login";
        }else if (users.getPassword().equals(password)==false){
            model.addAttribute("error","密码错误");
            return "/jsp/login";
        }else{
            session.setAttribute("users",users);
            return "/jsp/main";
        }
    }

    @RequestMapping("/logout")
    public String logout(HttpSession session){
        session.invalidate();
        return "/jsp/login";
    }

    @RequestMapping("/doMain")
    @ResponseBody
    public Map<String,Object> doMain(Integer pageSize, Integer pageIndex,Integer booktype,String bookname,Integer isborrow){
        Map<String,Object> map = new HashMap<>();
        PageInfo<Books> pageInfo = booksService.bList(pageIndex, pageSize,booktype,bookname,isborrow);
        map.put("data",pageInfo);
        return map;
    }

}
