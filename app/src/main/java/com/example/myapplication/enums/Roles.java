package com.example.myapplication.enums;

public enum Roles {
  WARRIOR("Warrior","w"),
  MAGE("Mage","m"),
  ASSASSIN("Assassin","a"),
  GUARDIAN("Guardian","g"),
  HUNTER("Hunter","h");

  private final String role;
  private final String shortName;

  Roles(String role, String shortName) {
    this.role = role;
    this.shortName = shortName;
  }

  public String getRole() {
    return role;
  }

  public String getShortName() {
    return shortName;
  }
}
