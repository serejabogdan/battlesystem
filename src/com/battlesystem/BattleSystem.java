package com.battlesystem;

import com.battlesystem.MediatorEvent.MediatorEvent;

public class BattleSystem implements Mediator {
  private Fighter player1;
  private Fighter player2;
  private BattleAnnouncer announcer;
  private BattleEventVisitor battleEventVisitor;

  public BattleSystem(Fighter player1, Fighter player2, BattleAnnouncer announcer,
      BattleEventVisitor battleEventVisitor) {
    this.player1 = player1;
    this.player2 = player2;
    this.announcer = announcer;
    this.battleEventVisitor = battleEventVisitor;

    player1.setMediator(this);
    player2.setMediator(this);
  }

  public void startBattle() {
    announcer.showFighterCharacteristics(player1);
    announcer.showFighterCharacteristics(player2);

    announcer.displaySeparator();
    announcer.startBattle();
    announcer.displaySeparator();

    while (player1.isAlive() && player2.isAlive()) {
      player1.performTurn(player2);
      if (player2.isAlive()) {
        player2.performTurn(player1);
      }

      announcer.showFighterCharacteristics(player1);
      announcer.showFighterCharacteristics(player2);
      announcer.displaySeparator();
    }
  }

  @Override
  public void notify(GameComponent gameObject, MediatorEvent event) {
    if (gameObject instanceof Fighter) {
      event.accept(battleEventVisitor, (Fighter) gameObject);
    }
  }
}
