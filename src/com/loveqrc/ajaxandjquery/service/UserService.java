package com.loveqrc.ajaxandjquery.service;

import com.loveqrc.ajaxandjquery.dao.UserDao;
import com.loveqrc.ajaxandjquery.domain.User;

import java.sql.SQLException;

public class UserService {
    public User checkUserName(String username) throws SQLException {
        return new UserDao().getUserByUserName(username);
    }
}
