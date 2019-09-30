package edu.cnm.deepdive.cards.model;

public enum Suit {

  CLUBS,
  DIAMONDS,
  HEARTS,
  SPADES;

  private static final String[] SYMBOLS = {"\u2663", "\u2662", "\u2661", "\u2660"};

  public String getSymbol() {
    int index = 0;
    switch (this) {
      case CLUBS:
        index = 0;
        break;
      case DIAMONDS:
        index = 1;
        break;
      case HEARTS:
        index = 2;
        break;
      case SPADES:
        index = 3;
        break;
    }
    return SYMBOLS[index];
  }