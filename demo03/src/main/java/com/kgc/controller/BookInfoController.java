package com.kgc.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kgc.pojo.Book_info;
import com.kgc.service.BookInfoService;
import com.kgc.service.BookInfoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class BookInfoController {

    @Resource
    BookInfoService bookInfoService;

    @RequestMapping("/BookInfo")
    public String BookInfo(Model model,String pageIndex,
                           @RequestParam(value = "bookType",required = false,defaultValue = "0") int bookType,
                           @RequestParam(value = "bookName",required = false,defaultValue = "")String bookName,
                           @RequestParam(value = "isBorrow",required = false,defaultValue = "2")int isBorrow){
        int pageNum=1;
        if(pageIndex!=null){
            pageNum=Integer.parseInt(pageIndex);
        }
        int pageSize=3;

        PageHelper.startPage(pageNum,pageSize);
        List<Book_info> bookInfos = bookInfoService.selectAll(bookType,bookName,isBorrow);
        PageInfo pageInfo=new PageInfo(bookInfos);
        model.addAttribute("pageInfo",pageInfo);
        return "index";
    }

    @RequestMapping("/close")
    public String close(HttpSession session){
        session.invalidate();
        return "redirect:/toLogin";
    }
}
