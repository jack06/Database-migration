package com.nf147.hello.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/HelloServlet.do")
public class HelloServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=utf-8");
        resp.setCharacterEncoding("UTF-8");

        String method = req.getMethod();
        PrintWriter writer = resp.getWriter();


        if ("GET".equals(method)) {
            writer.print("不支持Get");
        } else if ("POST".equals(method)) {
            writer.print("Hello");
        } else {
            throw new RuntimeException("不支持请求类型"+method);
        }
    }
}
