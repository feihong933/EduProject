package com.qb.edu.mapper.base;


public interface BaseMapper<T> {

    public T findById(Integer id);
    public T findByUUId(String uuid);

    public void deleteById(Integer id);
    public void deleteByUUId(String uuid);

    public void update(T t);

    public void insert(T t);

}