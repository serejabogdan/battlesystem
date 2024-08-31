package com.battlesystem;

public class BattleSystem {
  private Fighter player1;
  private Fighter player2;
  private BattleMessenger messenger;

  public BattleSystem(Fighter player1, Fighter player2, BattleMessenger messenger) {
    this.player1 = player1;
    this.player2 = player2;
    this.messenger = messenger;
  }

  public void startBattle() {
    messenger.displayFighterCharacteristics(player1);
    messenger.displayFighterCharacteristics(player2);

    messenger.displaySeparator();
    messenger.announceBattleStart();
    messenger.displaySeparator();

    while (player1.isAlive() && player2.isAlive()) {
      player1.performTurn(player2);
      if (player2.isAlive()) {
        player2.performTurn(player1);
      }

      messenger.displayFighterCharacteristics(player1);
      messenger.displayFighterCharacteristics(player2);
      messenger.displaySeparator();
    }
  }
}