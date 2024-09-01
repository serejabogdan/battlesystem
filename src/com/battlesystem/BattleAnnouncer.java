package com.battlesystem;

public class BattleAnnouncer {
  public void showFighterCharacteristics(Fighter fighter) {
    System.out.println(
        fighter.getName() + " [" + fighter.getFighterClass() + "] characteristics: " +
            "health: " + fighter.getCharacteristics().getHealth() +
            "; attack: " + fighter.getCharacteristics().getAttack() +
            "; defense: " + fighter.getCharacteristics().getDefense());
  }

  public void startBattle() {
    System.out.println("Fight begins.");
  }

  public void displaySeparator() {
    System.out.println();
  }

  public void attack(Fighter attacker, Fighter defender) {
    System.out.println(
        attacker.name + " [" + attacker.getFighterClass() + "] attacks " + defender.getName() + "! "
            + defender.getName() + " takes " + attacker.getCharacteristics().getAttack() + " damage");
  }

  public void applyBuffDefense(Fighter fighter) {
    System.out.println(
        fighter.name + " [" + fighter.getFighterClass() + "] got defense buff! " + fighter.name + "'s has "
            + fighter.characteristics.getDefense() + " defense");
  }

  public void victory(Fighter fighter) {
    System.out.println(fighter.name + " [" + fighter.getFighterClass() + "] is winner!");
  }
}