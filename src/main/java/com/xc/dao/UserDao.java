package com.xc.dao;

import com.xc.entity.User;

/**
 * Created by Scorpio_cc  on 2018/6/28.
 */
public interface UserDao {
    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);
}
