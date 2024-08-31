package com.battlesystem;

public class Mage extends Fighter {
  private FighterMessenger messenger;

  public Mage(String name, FighterMessenger messenger) {
    super(name, "mage", 50, 5, 0);
    this.messenger = messenger;
  }

  @Override
  public void performAction(Fighter fighter) {
    int damage = characteristics.getAttack();
    fighter.takeDamage(damage);
    messenger.announceAttack(this, fighter, damage);
  }

  @Override
  public void buffDefense() {
    characteristics.setDefense(characteristics.getDefense() + 16);
    messenger.announceBuffDefense(this);
  }
}