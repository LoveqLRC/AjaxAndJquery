package com.loveqrc.ajaxandjquery.jquery;

import com.loveqrc.ajaxandjquery.service.KeyWordService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(
        urlPatterns = "/searchKw"
)
public class SearchKwServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String kw = req.getParameter("kw");
        List<Object> list = null;
        try {
            list = new KeyWordService().findKw4Ajax(kw);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        if (list != null && list.size() > 0) {
            String s = list.toString();
            s = s.substring(1, s.length() - 1);
            System.out.println(s);
            resp.getWriter().println(s);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
