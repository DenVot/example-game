package org.homework;

public class Character extends Unit implements HealthPoint, Attacker {
  private int health = 1;
  private int damage = 1;

  public Character() {
    super();
  }

  public Character(String name) {
    super(name);
  }

  public Character(String name, int hp, int damage) {
    super(name);
    this.health = hp;
    this.damage = damage;
  }

  @Override
  public String who() {
    return "Character";
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

  @Override
  public void toAttack(HealthPoint enemy) {
    enemy.setHealth(enemy.getHealth() - damage);
  }
}
