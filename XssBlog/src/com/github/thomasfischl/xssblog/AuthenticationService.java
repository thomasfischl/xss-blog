package com.github.thomasfischl.xssblog;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.UUID;

public class AuthenticationService {

  private static AuthenticationService singleton;

  private Map<String, String> userMap = new HashMap<String, String>();

  public String login(String username, String password) {
    if (!userMap.containsKey(username)) {
      userMap.put(username, UUID.randomUUID().toString());
    }
    return userMap.get(username);
  }

  public String getUserName(String uid) {
    for (Entry<String, String> entry : userMap.entrySet()) {
      if (entry.getValue().equals(uid)) {
        return entry.getKey();
      }
    }
    return null;
  }

  public static AuthenticationService getIntance() {
    if (singleton == null) {
      singleton = new AuthenticationService();
    }
    return singleton;
  }

}
