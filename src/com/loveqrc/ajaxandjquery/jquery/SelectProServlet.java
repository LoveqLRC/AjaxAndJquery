package com.loveqrc.ajaxandjquery.jquery;

import com.loveqrc.ajaxandjquery.domain.Province;
import com.loveqrc.ajaxandjquery.service.ProvinceService;
import net.sf.json.JSONArray;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(
        urlPatterns = "/selectPro"
)
public class SelectProServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        List<Province> list = null;

        try {
            list = new ProvinceService().findAll();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        resp.setContentType("text/html;charset=utf-8");
        if (list != null && list.size() > 0) {
            resp.getWriter().print(JSONArray.fromObject(list));
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
