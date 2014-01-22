package com.github.thomasfischl.xssblog;

import java.util.ArrayList;
import java.util.List;

public class BlogPostService {

  private static BlogPostService singleton;

  private List<BlogPost> list = new ArrayList<BlogPost>();

  public void addBlogPost(String username, String title, String text) {
    list.add(new BlogPost(username, title, text));
  }

  public List<BlogPost> getList() {
    return list;
  }

  public void deleteAll() {
    list.clear();
  }

  public static BlogPostService getIntance() {
    if (singleton == null) {
      singleton = new BlogPostService();
    }
    return singleton;
  }

}
