package com.github.thomasfischl.xssblog;

public class BlogPost {

  private String username;

  private String title;

  private String text;

  public BlogPost(String username, String title, String text) {
    super();
    this.username = username;
    this.title = title;
    this.text = text;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

}
