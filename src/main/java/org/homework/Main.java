package org.homework;

public class Main {
  public static void main(String[] args) {
    Unit[] units = new Unit[] {
            new Building("Здание"),
            new Character("Персонаж"),
            new Spell("Заклинание")
    };

    for (Unit unit : units) {
      System.out.println(unit);
    }
  }
}
