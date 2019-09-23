package com.example.demo.controller;

import com.example.demo.userservice.useruservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class controller {

@Autowired
    useruservice useruservice;


public String login(String name,String password){



return "login1";
}


}
