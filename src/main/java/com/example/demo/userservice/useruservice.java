package com.example.demo.userservice;

import com.example.demo.entity.UserT;
import com.example.demo.mapper.UserTMapper;
import org.apache.ibatis.annotations.SelectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.provider.base.BaseSelectProvider;

import java.util.List;

@Service
public class useruservice {

@Autowired
    UserTMapper userTMapper;


    public UserT byname(String name) {
        return userTMapper.byname(name);
    }
}
