package com.example.demo.controller;

import com.example.demo.service.userservice;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class usercontroller {
    @Autowired
    com.example.demo.service.userservice userservice;

    @RequestMapping("login")
    public String login(String name,String password) {
        UsernamePasswordToken token1=new UsernamePasswordToken( name,password );




        return "login";
    }

    @RequestMapping("index")
    public String select(String name, String password) {
//    String name= user.getName();
//    String password= user.getPasswrod();

        System.out.println( name + "链接" + password );
        UsernamePasswordToken token=new UsernamePasswordToken( name, password );
        System.out.println( token.toString() );
        Subject subject=SecurityUtils.getSubject();
        System.out.println( subject.toString() );
        try {
            subject.login( token );
            return "success";

        } catch (AuthenticationException e) {
            String msg="用户或密码错误";
            if (StringUtils.isEmpty( e.getMessage() )) {
                msg=e.getMessage();
                System.out.println( msg );
            }
            return "error";
        }

//    userservice.select( user );
//return userservice.select( user );
    }
}