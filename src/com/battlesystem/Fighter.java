package com.battlesystem;

public abstract class Fighter {
  protected String name;
  protected int health;
  protected int attack;
  protected int defense;

  public Fighter(String name, int health, int attack, int defense) {
    this.name = name;
    this.health = health;
    this.attack = attack;
    this.defense = defense;
  }

  public abstract void performAction(Fighter target);

  public abstract void defend();

  public String getName() {
    return name;
  }

  public int getDefense() {
    return defense;
  }

  private void defend(int damage) {
    if (defense > 0) {

      defense -= damage;

      if (defense < 0) {
        health += defense;
        defense = 0;
      }
    }
  }

  public void takeDamage(int damage) {
    if (defense > 0) {
      defend(damage);
    } else {
      health -= damage;
    }

    if (health < 0) {
      health = 0;
    }
  }

  public boolean isAlive() {
    return health > 0;
  }

  public String getCharacteristics() {
    return name + "'s characteristics: " + "health: " + health + "; attack: " + attack + "; defense: " + defense;
  }
}
