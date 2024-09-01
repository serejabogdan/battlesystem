package com.battlesystem;

public class BattleSystem implements Mediator {
  private Fighter player1;
  private Fighter player2;

  public BattleSystem(Fighter player1, Fighter player2) {
    this.player1 = player1;
    this.player2 = player2;
  }

  public void startBattle() {
    displayFighterCharacteristics(player1);
    displayFighterCharacteristics(player2);

    displaySeparator();
    announceBattleStart();
    displaySeparator();

    while (player1.isAlive() && player2.isAlive()) {
      player1.performTurn(player2);
      if (player2.isAlive()) {
        player2.performTurn(player1);
      }

      displayFighterCharacteristics(player1);
      displayFighterCharacteristics(player2);
      displaySeparator();
    }
  }

  @Override
  public void notifyAttack(Fighter attacker, Fighter defender, int damage) {
    System.out.println(
        attacker.name + " [" + attacker.getFighterClass() + "] attacks " + attacker.getName() + "! "
            + defender.getName() + " takes " + damage + " damage");
  }

  @Override
  public void notifyBuffDefense(Fighter fighter) {
    System.out.println(
        fighter.name + " [" + fighter.getFighterClass() + "] got defend buff! " + fighter.name + "'s has "
            + fighter.characteristics.getDefense() + " defense");
  }

  @Override
  public void notifyDeath(Fighter fighter) {
    System.out.println(fighter.name + " [" + fighter.getFighterClass() + "] is died.");
  }
  
  @Override
  public void announceBattleStart() {
    System.out.println("Fight begins.");
  }
  
  @Override
  public void displaySeparator() {
    System.out.println();
  }

  public void displayFighterCharacteristics(Fighter fighter) {
    System.out.println(
        fighter.getName() + " [" + fighter.getFighterClass() + "] characteristics: " +
            "health: " + fighter.getCharacteristics().getHealth() +
            "; attack: " + fighter.getCharacteristics().getAttack() +
            "; defense: " + fighter.getCharacteristics().getDefense());
  }
}