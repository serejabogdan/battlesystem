package com.battlesystem;

public class Warrior extends Fighter {
  public Warrior(String name) {
    super(name, 100, 15, 10);
  }

  @Override
  public void performAction(Fighter fighter) {
    System.out.println(name + " attacks " + fighter.getName());
    int damage = attack;
    fighter.takeDamage(attack);
    System.out.println(fighter.getName() + " takes " + damage + " damage");
  }

  @Override
  public void defend() {
    System.out.println(name + " got defend buff");
    defense += 5;
    System.out.println(name + "'s has " + getDefense() + " defense");
  }
}