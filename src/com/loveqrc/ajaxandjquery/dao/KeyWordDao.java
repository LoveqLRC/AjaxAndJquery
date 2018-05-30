package com.loveqrc.ajaxandjquery.dao;

import com.loveqrc.ajaxandjquery.utils.DataSourceUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ColumnListHandler;

import java.sql.SQLException;
import java.util.List;

public class KeyWordDao {
    public List<Object> findKw4Ajax(String kw) throws SQLException {
        QueryRunner queryRunner = new QueryRunner(DataSourceUtils.getDataSource());
        String sql = "select keyword  from  keyword where keyword like  ? limit 5";

        return queryRunner.query(sql,new ColumnListHandler("keyword"),"%"+kw+"%");
    }
}
