package com.github.thomasfischl.xssblog;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/info")
public class InfoServlet extends HttpServlet {
  private static final long serialVersionUID = 1L;

  private AuthenticationService service = AuthenticationService.getIntance();

  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    HttpSession session = req.getSession();

    try (PrintWriter writer = resp.getWriter()) {
      Object username = session.getAttribute(LoginServlet.USERNAME);

      if (username == null) {
        username = getUserByCookie(req);
      }

      if (username != null) {
        writer.write("Username: " + username);
      } else {
        writer.write("No user information available");
      }
    }

  }

  private Object getUserByCookie(HttpServletRequest req) {
    Cookie[] cookies = req.getCookies();
    if (cookies != null) {
      for (Cookie cookie : cookies) {
        if (cookie.getName().equals("USERID")) {
          return service.getUserName(cookie.getValue());
        }
      }
    }
    return service.getUserName(req.getParameter("USERID"));
  }
}
