package com.loveqrc.ajaxandjquery.service;

import com.loveqrc.ajaxandjquery.dao.ProvinceDao;
import com.loveqrc.ajaxandjquery.domain.Province;

import java.sql.SQLException;
import java.util.List;

public class ProvinceService {
    public List<Province> findAll() throws SQLException {

        return new ProvinceDao().findAll();
    }
}
