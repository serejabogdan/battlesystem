package com.battlesystem;

public class Warrior extends Fighter {
  public Warrior(String name) {
    super(name, 100, 15, 10);
  }

  @Override
  public void performAction(Fighter fighter) {
    System.out.println(name + " attacks " + fighter.getName());
    int damage = characteristics.getAttack();
    fighter.takeDamage(damage);
    System.out.println(fighter.getName() + " takes " + damage + " damage");
  }

  @Override
  public void buffDefense() {
    System.out.println(name + " got defend buff");
    characteristics.setDefense(characteristics.getDefense() + 5);
    System.out.println(name + "'s has " + characteristics.getDefense() + " defense");
  }
}