package com.battlesystem;

import com.battlesystem.MediatorEvent.AttackMediatorEvent;
import com.battlesystem.MediatorEvent.DefenseBuffMediatorEvent;
import com.battlesystem.MediatorEvent.SimpleMediatorEvent;
import com.battlesystem.MediatorEvent.VictoryMediatorEvent;

public interface MediatorEventVisitor {
  void visit(SimpleMediatorEvent event, Fighter fighter);

  void visit(AttackMediatorEvent event, Fighter fighter);

  void visit(DefenseBuffMediatorEvent event, Fighter fighter);

  void visit(VictoryMediatorEvent event, Fighter fighter);
}