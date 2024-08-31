package com.battlesystem;

import java.security.SecureRandom;

public abstract class Fighter {
  protected String name;
  protected FighterCharacteristics characteristics;
  private SecureRandom random;

  public Fighter(String name, int health, int attack, int defense) {
    this.name = name;
    this.characteristics = new FighterCharacteristics(health, attack, defense);
    this.random = new SecureRandom();
  }

  public abstract void performAction(Fighter target);

  public abstract void buffDefense();

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
    } else {
      buffDefense();
    }
  }

  public FighterCharacteristics getCharacteristics() {
    return characteristics;
  }
}
