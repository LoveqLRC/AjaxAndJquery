package com.loveqrc.ajaxandjquery.ajax;

import com.loveqrc.ajaxandjquery.domain.User;
import com.loveqrc.ajaxandjquery.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(
        urlPatterns = "/checkUserName"
)
public class CheckUserNameServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        User user = null;
        try {
            user = new UserService().checkUserName(username);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        if (user == null) {
            resp.getWriter().print(1);
        } else {
            resp.getWriter().print(0);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
