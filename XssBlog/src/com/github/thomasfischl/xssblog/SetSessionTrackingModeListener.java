package com.github.thomasfischl.xssblog;

import java.util.HashSet;
import java.util.Set;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.SessionTrackingMode;
import javax.servlet.annotation.WebListener;

@WebListener
public class SetSessionTrackingModeListener implements ServletContextListener {

  public void contextInitialized(ServletContextEvent sce) {
    Set<SessionTrackingMode> modes = new HashSet<SessionTrackingMode>();
    modes.add(SessionTrackingMode.URL); // thats the default behaviour!
    modes.add(SessionTrackingMode.COOKIE);
    sce.getServletContext().setSessionTrackingModes(modes);
  }

  public void contextDestroyed(ServletContextEvent sce) {
  }

}