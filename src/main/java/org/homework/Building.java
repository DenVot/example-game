package org.homework;

public class Building extends Unit implements HealthPoint {
  private int health = 1;

  public Building() {
    super();
  }

  public Building(String name) {
    super(name);
  }

  public Building(String name, int health) {
    super(name);
    this.health = health;
  }

  @Override
  public String who() {
    return "Building";
  }

  @Override
  public int getHealth() {
    return health;
  }

  @Override
  public void setHealth(int value) {
    health = value;
  }

  @Override
  public boolean isAlive() {
    return getHealth() > 0;
  }
}
