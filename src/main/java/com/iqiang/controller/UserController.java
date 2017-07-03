package com.iqiang.controller;

import com.iqiang.pojo.TbUser;
import com.iqiang.service.UserService;
import org.omg.CORBA.Object;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by zhuzhiqiang on 17/6/19.
 * 功能：登录、注册
 */
@Controller
@RequestMapping(value = "user", method = RequestMethod.POST)
public class UserController extends BaseController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/login")
    public Object login(@ModelAttribute(value = "userName") String userName,
                        @ModelAttribute(value = "password") String password) {
        TbUser user = userService.searchUserByUserNameAndPW(userName, password);
        return null;
    }

    @RequestMapping(value = "/register")
    public Object register(@ModelAttribute(value = "userName") String userName,
                           @ModelAttribute(value = "password") String password) {
        boolean re = userService.createUserWithUserNameAndPW(userName, password);
        return null;
    }

}
