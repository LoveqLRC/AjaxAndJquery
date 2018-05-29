package com.loveqrc.ajaxandjquery.ajax;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(
        urlPatterns = "/getAjax"
)
public class GetAjaxServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // 接受参数
        String username = request.getParameter("username");
        System.out.println(username);

        // 响应数据
        response.setContentType("text/html;charset=utf-8");
        response.getWriter().println("姓名:" + username);
    }
}
