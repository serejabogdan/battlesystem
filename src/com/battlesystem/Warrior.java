package com.battlesystem;

public class Warrior extends Fighter {
  public Warrior(String name) {
    super(name, 100, 15, 10);
  }

  @Override
  public void performAction(Fighter fighter) {
    int damage = characteristics.getAttack();
    fighter.takeDamage(damage);
  }

  @Override
  public void buffDefense() {
    characteristics.setDefense(characteristics.getDefense() + 5);
  }

  @Override
  public FighterClass getFighterClass() {
    return FighterClass.WARRIOR;
  }
}