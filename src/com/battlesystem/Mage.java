package com.battlesystem;

public class Mage extends Fighter {
  public Mage(String name) {
    super(name, 50, 5, 0);
  }

  @Override
  public void performAction(Fighter fighter) {
    int damage = characteristics.getAttack();
    fighter.takeDamage(damage);
  }

  @Override
  public void buffDefense() {
    characteristics.setDefense(characteristics.getDefense() + 16);
  }

  @Override
  public FighterClass getFighterClass() {
    return FighterClass.MAGE;
  }
}