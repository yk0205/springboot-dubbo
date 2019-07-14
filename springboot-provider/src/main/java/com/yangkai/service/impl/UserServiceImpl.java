package com.yangkai.service.impl;


import com.google.common.collect.Maps;
import com.yangkai.bean.User;
import com.yangkai.service.UserService;
import org.apache.dubbo.config.annotation.Service;
import org.slf4j.*;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    @Override
    public List<User> getAllUser() {

        Maps.newConcurrentMap();
        User user = new User();
        user.setId(Long.parseLong("1"));
        user.setAddress("湖北随州");
        user.setSex("男");
        user.setUsername("yangkai");

        return null;
    }


}
