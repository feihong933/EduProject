package com.qb.edu.service.base;

public interface IBaseService<T> {
    public T findById(Integer id);
    public T findByUUId(String uuid);

    public void deleteById(Integer id);
    public void deleteByUUId(String uuid);

    public void update(T t);

    public void insert(T t);

}
