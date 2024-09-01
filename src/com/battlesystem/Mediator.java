package com.battlesystem;

public interface Mediator {
  void notifyAttack(Fighter attacker, Fighter defender, int damage);
  void notifyBuffDefense(Fighter fighter);
  void notifyDeath(Fighter fighter);
  void announceBattleStart();
  void displaySeparator();
  void displayFighterCharacteristics(Fighter fighter);
}
