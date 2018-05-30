package com.loveqrc.ajaxandjquery.dao;

import com.loveqrc.ajaxandjquery.domain.Province;
import com.loveqrc.ajaxandjquery.utils.DataSourceUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

public class ProvinceDao {
    public List<Province> findAll() throws SQLException {
        QueryRunner queryRunner = new QueryRunner(DataSourceUtils.getDataSource());
        String sql = "select * from province";
        return queryRunner.query(sql, new BeanListHandler<>(Province.class));

    }
}
