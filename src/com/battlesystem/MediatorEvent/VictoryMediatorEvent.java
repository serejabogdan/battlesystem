package com.battlesystem.MediatorEvent;

import com.battlesystem.Fighter;
import com.battlesystem.MediatorEventVisitor;

public class VictoryMediatorEvent extends MediatorEvent {
  @Override
  public void accept(MediatorEventVisitor visitor, Fighter fighter) {
    visitor.visit(this, fighter);
  }
}
