package com.battlesystem.MediatorEvent;

import com.battlesystem.Fighter;
import com.battlesystem.MediatorEventVisitor;

public abstract class MediatorEvent {
    public abstract void accept(MediatorEventVisitor visitor, Fighter fighter);
}
