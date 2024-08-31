package com.battlesystem;

public class Main {
  public static void main(String[] args) {
    FighterMessenger fighterMessenger = new FighterMessenger();
    Fighter fighter1 = new Warrior("Moc'Ra", fighterMessenger);
    Fighter fighter2 = new Mage("Anarak", fighterMessenger);
    BattleMessenger battleMessenger = new BattleMessenger();

    BattleSystem battle = new BattleSystem(fighter1, fighter2, battleMessenger);
    battle.startBattle();
  }
}
