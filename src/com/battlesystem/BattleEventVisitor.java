package com.battlesystem;

import com.battlesystem.MediatorEvent.AttackMediatorEvent;
import com.battlesystem.MediatorEvent.DefenseBuffMediatorEvent;
import com.battlesystem.MediatorEvent.SimpleMediatorEvent;
import com.battlesystem.MediatorEvent.VictoryMediatorEvent;

public class BattleEventVisitor implements MediatorEventVisitor {
  private BattleAnnouncer announcer;

  public BattleEventVisitor(BattleAnnouncer announcer) {
    this.announcer = announcer;
  }

  @Override
  public void visit(AttackMediatorEvent event, Fighter fighter) {
    announcer.attack(fighter, event.getDefender());
  }

  @Override
  public void visit(DefenseBuffMediatorEvent event, Fighter fighter) {
    announcer.applyBuffDefense(fighter);
  }

  @Override
  public void visit(VictoryMediatorEvent event, Fighter fighter) {
    announcer.victory(fighter);
  }

  @Override
  public void visit(SimpleMediatorEvent event, Fighter fighter) {
    announcer.message(fighter, event.getMessage());
  }
}
