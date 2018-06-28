package com.xc.service;

import com.xc.entity.User;

/**
 * Created by Scorpio_cc  on 2018/6/28.
 */

public interface UserService {
    public User getUserById(int userId);

    boolean addUser(User record);
}
