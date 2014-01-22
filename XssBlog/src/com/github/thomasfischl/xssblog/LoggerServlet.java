package com.github.thomasfischl.xssblog;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/logger")
public class LoggerServlet extends HttpServlet {
  private static final long serialVersionUID = 1L;

  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    System.out.println("=====================================================================");
    try (BufferedReader is = new BufferedReader(new InputStreamReader(req.getInputStream()))) {
      String line;

      while ((line = is.readLine()) != null) {
        System.out.println(line);
      }
    }
  }
}
