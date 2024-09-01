package com.battlesystem;

public class Main {
  public static void main(String[] args) {
    Fighter fighter1 = new Warrior("Moc'Ra");
    Fighter fighter2 = new Mage("Anarak");

    BattleSystem battle = new BattleSystem(fighter1, fighter2);
    battle.startBattle();
  }
}
