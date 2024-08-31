package com.battlesystem;

public class BattleSystem {
  private Fighter player1;
  private Fighter player2;

  public BattleSystem(Fighter player1, Fighter player2) {
    this.player1 = player1;
    this.player2 = player2;
  }

  public void startBattle() {
    System.out.println("Fight begins.");
    System.out.println(
        player1.getName() + "'s characteristics: "
            + "health: " + player1.getCharacteristics().getHealth()
            + "; attack: " + player1.getCharacteristics().getAttack()
            + "; defense: " + player1.getCharacteristics().getDefense());
    System.out.println(
        player2.getName() + "'s characteristics: "
            + "health: " + player2.getCharacteristics().getHealth()
            + "; attack: " + player2.getCharacteristics().getAttack()
            + "; defense: " + player2.getCharacteristics().getDefense());
    System.out.println();

    while (player1.isAlive() && player2.isAlive()) {
      player1.performTurn(player2);
      if (player2.isAlive()) {
        player2.performTurn(player1);
      }

      System.out.println(
          player1.getName() + "'s characteristics: "
              + "health: " + player1.getCharacteristics().getHealth()
              + "; attack: " + player1.getCharacteristics().getAttack()
              + "; defense: " + player1.getCharacteristics().getDefense());
      System.out.println(
          player2.getName() + "'s characteristics: "
              + "health: " + player2.getCharacteristics().getHealth()
              + "; attack: " + player2.getCharacteristics().getAttack()
              + "; defense: " + player2.getCharacteristics().getDefense());
      System.out.println();
    }
  }
}