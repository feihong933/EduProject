package com.qb.edu.service;

import com.qb.edu.model.User;
import com.qb.edu.service.base.IBaseService;

public interface IUserService extends IBaseService<User> {

//   特有的方法
    public User login(String name,String password);
}
