package com.loveqrc.ajaxandjquery.dao;

import com.loveqrc.ajaxandjquery.domain.User;
import com.loveqrc.ajaxandjquery.utils.DataSourceUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import javax.sql.DataSource;
import java.sql.SQLException;

public class UserDao {
    public User getUserByUserName(String username) throws SQLException {
        QueryRunner queryRunner = new QueryRunner(DataSourceUtils.getDataSource());
        String sql = "select * from user where username = ?limit 1";
        return queryRunner.query(sql, new BeanHandler<>(User.class), username);
    }
}
