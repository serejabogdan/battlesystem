package com.battlesystem;

public class BattleMessenger {
  public void displayFighterCharacteristics(Fighter fighter) {
    System.out.println(
        fighter.getName() + " [" + fighter.className + "] characteristics: " +
            "health: " + fighter.getCharacteristics().getHealth() +
            "; attack: " + fighter.getCharacteristics().getAttack() +
            "; defense: " + fighter.getCharacteristics().getDefense());
  }

  public void announceBattleStart() {
    System.out.println("Fight begins.");
  }

  public void displaySeparator() {
    System.out.println();
  }
}