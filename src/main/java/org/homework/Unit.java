package org.homework;

public abstract class Unit {
  private String name;
  private static int count = 0;

  public Unit() {
    count++;
    this.name = "NoName " + count;
  }

  public Unit(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public abstract String who();

  @Override
  public String toString() {
    return who() + ": " + name;
  }
}
