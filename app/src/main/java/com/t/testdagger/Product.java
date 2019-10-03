package com.t.testdagger;

import javax.inject.Inject;

/**
 * Created by Korir on 10/3/19.
 * amoskrr@gmail.com
 */
public class Product {

  private String name = "default name";

  @Inject
  public Product() {
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
