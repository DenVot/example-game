package org.homework;

public class Spell extends Unit implements Attacker {
  private int damage = 1;

  public Spell() {
  }

  @Override
  public String who() {
    return "Spell";
  }

  public Spell(String name, int damage) {
    super(name);
    this.damage = damage;
  }

  public Spell(String name) {
    super(name);
  }

  @Override
  public void toAttack(HealthPoint enemy) {
    enemy.setHealth(enemy.getHealth() - damage);
  }
}
