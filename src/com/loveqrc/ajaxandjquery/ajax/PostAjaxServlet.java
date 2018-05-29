package com.loveqrc.ajaxandjquery.ajax;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(
        urlPatterns = "/postAjax"
)
public class PostAjaxServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        // 接受参数
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        System.out.println(password);
        System.out.println(username);

        // 响应数据
        response.setContentType("text/html;charset=utf-8");
        response.getWriter().println("姓名:" + username + "  密码  " + password);
    }
}
