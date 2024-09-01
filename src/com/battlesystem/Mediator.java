package com.battlesystem;

import com.battlesystem.MediatorEvent.MediatorEvent;

public interface Mediator {
  void notify(GameComponent gameObject, MediatorEvent event);
}
