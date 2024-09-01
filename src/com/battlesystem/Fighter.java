package com.battlesystem;

import java.security.SecureRandom;

import com.battlesystem.MediatorEvent.VictoryMediatorEvent;
import com.battlesystem.MediatorEvent.AttackMediatorEvent;
import com.battlesystem.MediatorEvent.DefenseBuffMediatorEvent;

public abstract class Fighter {
  protected String name;
  protected FighterCharacteristics characteristics;
  private SecureRandom random;
  protected Mediator mediator;

  public Fighter(String name, int health, int attack, int defense) {
    this.name = name;
    this.characteristics = new FighterCharacteristics(health, attack, defense);
    this.random = new SecureRandom();
  }

  public abstract void performAction(Fighter target);

  public abstract void buffDefense();

  public void setMediator(Mediator mediator) {
    this.mediator = mediator;
  }

  public String getName() {
    return name;
  }

  private void defend(int damage) {
    int currentDefense = characteristics.getDefense();
    currentDefense -= damage;

    if (currentDefense < 0) {
      characteristics.setHealth(characteristics.getHealth() + currentDefense);
      characteristics.setDefense(0);
    } else {
      characteristics.setDefense(currentDefense);
    }
  }

  public void takeDamage(int damage) {
    if (characteristics.getDefense() > 0) {
      defend(damage);
    } else {
      characteristics.setHealth(characteristics.getHealth() - damage);
    }

    if (characteristics.getHealth() < 0) {
      characteristics.setHealth(0);
    }
  }

  public boolean isAlive() {
    return characteristics.getHealth() > 0;
  }

  public void performTurn(Fighter defender) {
    if (random.nextBoolean()) {
      performAction(defender);
      mediator.notify(this, new AttackMediatorEvent(defender));
    } else {
      buffDefense();
      mediator.notify(this, new DefenseBuffMediatorEvent());
    }
    
    if (!defender.isAlive()) {
      mediator.notify(this, new VictoryMediatorEvent());
    }
  }

  public FighterCharacteristics getCharacteristics() {
    return characteristics;
  }

  public abstract FighterClass getFighterClass();
}
