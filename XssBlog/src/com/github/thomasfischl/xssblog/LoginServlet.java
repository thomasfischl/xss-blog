package com.github.thomasfischl.xssblog;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
  private static final long serialVersionUID = 1L;
  public static final String USERNAME = "username";

  private AuthenticationService service = AuthenticationService.getIntance();

  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    HttpSession session = req.getSession();
    if (session.getAttribute(USERNAME) != null) {
      resp.sendRedirect("./");
      return;
    }
    req.getRequestDispatcher("./jsp/login.jsp").forward(req, resp);
  }

  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    String username = req.getParameter("username");
    String password = req.getParameter("password");

    if (username != null && password != null) {

      req.getSession(true).setAttribute(USERNAME, username);
      Cookie cookie = new Cookie("USERID", service.login(username, password));
      cookie.setMaxAge(60 * 60);
      resp.addCookie(cookie);

      resp.sendRedirect("./");
    } else {
      req.getRequestDispatcher("./jsp/login.jsp").forward(req, resp);
    }

  }
}
