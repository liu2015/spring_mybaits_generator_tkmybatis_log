package com.example.demo.service;

import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;
import org.apache.ibatis.annotations.SelectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import tk.mybatis.mapper.provider.base.BaseSelectProvider;

import java.util.List;

@Controller
public class userservice {

    @Autowired
    UserMapper userMapper;

    @SelectProvider(type=BaseSelectProvider.class, method="dynamicSQL")
    public List<User> select(User user) {
        return userMapper.select( user );
    }
}
