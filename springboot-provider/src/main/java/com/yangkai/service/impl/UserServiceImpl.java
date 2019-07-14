package com.yangkai.service.impl;


import com.google.common.collect.Lists;
import com.yangkai.bean.User;
import com.yangkai.service.UserService;
import org.apache.dubbo.config.annotation.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public List<User> getAllUser() {

        List<User> list = Lists.newArrayList();
        User user = new User();
        user.setId(Long.parseLong("1"));
        user.setAddress("湖北随州");
        user.setSex("男");
        user.setUsername("yangkai");
        list.add(user);
        return list;
    }


}
