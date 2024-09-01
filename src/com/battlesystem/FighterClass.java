package com.battlesystem;

public enum FighterClass {
  WARRIOR("warrior"),
  MAGE("mage");

  private final String className;

  FighterClass(String className) {
    this.className = className;
  }

  public String getClassName() {
    return className;
  }
}
