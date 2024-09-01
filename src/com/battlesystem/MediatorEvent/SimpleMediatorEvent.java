package com.battlesystem.MediatorEvent;

import com.battlesystem.Fighter;
import com.battlesystem.MediatorEventVisitor;

public class SimpleMediatorEvent extends MediatorEvent {
  private String message;

  public String getMessage() {
    return message;
  }

  @Override
  public void accept(MediatorEventVisitor visitor, Fighter fighter) {
    visitor.visit(this, fighter);
  }
}
