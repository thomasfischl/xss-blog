package com.github.thomasfischl.xssblog;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/")
public class BlogServlet extends HttpServlet {
  private static final long serialVersionUID = 1L;

  private BlogPostService service = BlogPostService.getIntance();

  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    if ("delete".equalsIgnoreCase(req.getParameter("action"))) {
      service.deleteAll();
    }

    req.setAttribute("posts", service.getList());
    req.getRequestDispatcher("./jsp/index.jsp").forward(req, resp);
  }

  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    String title = req.getParameter("title");
    String text = req.getParameter("text");
    String username = String.valueOf(req.getSession().getAttribute(LoginServlet.USERNAME));
    service.addBlogPost(username, title, text);
    resp.sendRedirect("./");
  }

}
