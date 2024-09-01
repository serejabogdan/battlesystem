package com.battlesystem.MediatorEvent;

import com.battlesystem.Fighter;
import com.battlesystem.MediatorEventVisitor;

public class DefenseBuffMediatorEvent extends MediatorEvent {
  @Override
  public void accept(MediatorEventVisitor visitor, Fighter fighter) {
    visitor.visit(this, fighter);
  }
}
