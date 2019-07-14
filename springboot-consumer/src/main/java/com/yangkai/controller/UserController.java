package com.yangkai.controller;


import com.google.common.collect.Maps;
import com.yangkai.bean.User;
import com.yangkai.service.UserService;
import org.apache.dubbo.config.annotation.Reference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping(value = "/user")
public class UserController {


    @Reference
    private UserService userService;

    Logger logger = LoggerFactory.getLogger(UserController.class);

    /**
     * 本地访问内容地址 ：http://localhost:8080/user/getAllUser
     *
     * @return
     */
    @ResponseBody
    @RequestMapping("/getAllUser")
    public Map<String, Object> getAllUser() {
        Map<String, Object> map = Maps.newHashMap();
        try {
            List<User> users = userService.getAllUser();
            map.put("users", users);
        } catch (Exception e) {
            logger.error("getAllUser error " + e);
        }
        return map;
    }


}
