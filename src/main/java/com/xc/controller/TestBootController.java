package com.xc.controller;

import com.xc.entity.User;
import com.xc.service.UserService;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by Scorpio_cc  on 2018/6/28.
 */

@RestController
@EnableAutoConfiguration
@RequestMapping("/boot")
public class TestBootController {
    @Resource
    private UserService userService;
    @RequestMapping("/user")
    @ResponseBody
    public User getUser(HttpServletRequest request, Model model){
        //User user = new User();
        //user.setName("ttt");
        int userId = Integer.parseInt(request.getParameter("id"));
        User user = this.userService.getUserById(userId);
        return user;
    }
}

