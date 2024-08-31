package com.battlesystem;

import java.util.Random;

public class BattleSystem {
  private Fighter player1;
  private Fighter player2;
  private Random random;

  public BattleSystem(Fighter player1, Fighter player2) {
    this.player1 = player1;
    this.player2 = player2;
    this.random = new Random();
  }

  public void startBattle() {
    System.out.println("Fight begins.");
    System.out.println(player1.getCharacteristics());
    System.out.println(player2.getCharacteristics());
    System.out.println();

    while (player1.isAlive() && player2.isAlive()) {
      performTurn(player1, player2);
      if (player2.isAlive()) {
        performTurn(player2, player1);
      }

      System.out.println(player1.getCharacteristics());
      System.out.println(player2.getCharacteristics());
      System.out.println();
    }
  }

  private void performTurn(Fighter attacker, Fighter defender) {
    // System.out.println(attacker.getName() + "'s turn");
    if (random.nextBoolean()) {
      attacker.performAction(defender);
    } else {
      attacker.defend();
    }
  }
}
