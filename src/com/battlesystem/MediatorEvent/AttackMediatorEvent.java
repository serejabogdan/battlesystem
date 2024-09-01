package com.battlesystem.MediatorEvent;

import com.battlesystem.Fighter;
import com.battlesystem.MediatorEventVisitor;

public class AttackMediatorEvent extends MediatorEvent {
  private Fighter defender;

  public AttackMediatorEvent(Fighter fighter) {
    this.defender = fighter;
  }

  public Fighter getDefender() {
    return defender;
  }

  @Override
  public void accept(MediatorEventVisitor visitor, Fighter fighter) {
    visitor.visit(this, fighter);
  }
}
