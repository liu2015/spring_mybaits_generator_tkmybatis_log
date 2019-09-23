package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.service.userservice;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class usercontroller {
@Autowired
    userservice userservice;

@RequestMapping("login")
public String login(){

    return "login";
}

@RequestMapping("index")
    public String select(User user) {
    String name= user.getName();
    String password= user.getPasswrod();

    System.out.println( name+"链接"+password );
    UsernamePasswordToken token=new UsernamePasswordToken( name,password );
    Subject subject=SecurityUtils.getSubject();
    try{
        subject.login( token );
        return "success";

    }catch (AuthenticationException e)
    {
        String msg="用户或密码错误";
        if (StringUtils.isEmpty( e.getMessage() ))
        {
            msg=e.getMessage();
        }
        return "error";
    }

//    userservice.select( user );
//return userservice.select( user );
    }
}
