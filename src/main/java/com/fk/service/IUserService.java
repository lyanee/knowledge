package com.fk.service;

import com.fk.bean.User;

/**
 * Created by FK on 2017/2/9.
 */
public interface IUserService {
    public User selectUserByID(int id);
    public int saveUser(User user);
    public User selectUserByEmail(String email);
    public int updateByEmail(User user);
}
