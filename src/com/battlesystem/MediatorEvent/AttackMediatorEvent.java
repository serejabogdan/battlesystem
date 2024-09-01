package com.battlesystem.MediatorEvent;

import com.battlesystem.Fighter;

public class AttackMediatorEvent extends MediatorEvent {
  private Fighter defender;

  public AttackMediatorEvent(Fighter fighter) {
    this.defender = fighter;
  }

  public Fighter getDefender() {
    return defender;
  }
}
