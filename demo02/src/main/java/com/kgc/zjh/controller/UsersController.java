package com.kgc.zjh.controller;

import com.kgc.zjh.pojo.Users;
import com.kgc.zjh.service.UsersService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

@Controller
public class UsersController {

    @Resource
    UsersService usersService;

    @RequestMapping("/toLogin")
    public String login(){
        return "login";
    }

    @RequestMapping("/doLogin")
    public String doLogin(Model model, String user_code, String password, HttpSession session){
        Users users = usersService.selectByName(user_code);
        if(users==null){
            model.addAttribute("error","账号或密码错误");
            return "login";
        }else if(users.getPassword().equals(password)==false){
            model.addAttribute("error","密码不正确");
            return "login";
        }else{
            session.setAttribute("users",users);
            return "redirect:/BookInfo";
        }
    }
}
