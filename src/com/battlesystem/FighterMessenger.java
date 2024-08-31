package com.battlesystem;

public class FighterMessenger {
  public void announceAttack(Fighter fighter, Fighter defender, int damage) {
    System.out.println(
        fighter.name + " [" + fighter.className + "] attacks " + fighter.getName() + "! "
            + defender.getName() + " takes " + damage + " damage");
  }

  public void announceBuffDefense(Fighter fighter) {
    System.out.println(
        fighter.name + " [" + fighter.className + "] got defend buff! " + fighter.name + "'s has "
            + fighter.characteristics.getDefense() + " defense");
  }
}