package com.qb.edu.service.base;

import com.qb.edu.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class BaseServiceImpl<T> implements IBaseService<T>{
//统一管理dao
    @Autowired
    protected UserMapper userMapper;
}
