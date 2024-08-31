package com.battlesystem;

public class Warrior extends Fighter {
  private FighterMessenger messenger;

  public Warrior(String name, FighterMessenger messenger) {
    super(name, "warrior", 100, 15, 10);
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
    characteristics.setDefense(characteristics.getDefense() + 5);
    messenger.announceBuffDefense(this);
  }
}