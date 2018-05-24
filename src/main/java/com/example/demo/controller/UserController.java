package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;

/**
 * Created by lixingyuan on 2018/5/9.
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping(value = "/toLogin")
    public  String toLogin(){
        return "login";
    }

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public  String login(String username, String password, HttpSession session){
        String sql = "where username='"+username+"' and password='"+password+"'";
        User user = userService.userLogin(sql);
        System.out.println(user.getUsername());
        System.out.println(user.getPassword());
        if (user!=null) {
            session.setAttribute("user",user);
            return "/s/success";
        }else {
            return "login";
        }
    }
    @RequestMapping(value = "/success")
    public  String success(){
        return "/s/success";
    }
}
