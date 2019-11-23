package com.qb.edu.web.controller;

import com.qb.edu.model.User;
import com.qb.edu.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("user")
public class UserController {
    @Autowired
    private IUserService userService;

@RequestMapping("find")
public String find(Integer id){
    User user=userService.findById(id);
    System.out.println(user);
    return null;
}

@RequestMapping("login")
    public String login(){
        System.out.println("#####");
        return "Default";
    }

    @RequestMapping("manage")
    public String manage(){
    return "User/UserManage";
    }

    @RequestMapping("info")
    public String info(){
    return "User/UserInfo";
    }
    @RequestMapping("edit")
    public String edit(){
    return "User/UserEdit";
    }
}
