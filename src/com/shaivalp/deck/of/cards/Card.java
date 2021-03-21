package com.shaivalp.deck.of.cards;

public abstract class Card {
	
	protected Suit suit;
	protected int faceValue;
	
	public abstract int value();
	
	Card(Suit suit, int faceValue) {
		this.suit = suit;
		this.faceValue = faceValue;
	}

	
	public int getFaceValue() {
		return faceValue;
	}
	public void setFaceValue(int faceValue) {
		this.faceValue = faceValue;
	}
	public Suit getSuit() {
		return suit;
	}
	public void setSuit(Suit suit) {
		this.suit = suit;
	}

	public void print() {
		String[] faceValues = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
		System.out.print(faceValues[faceValue - 1]);
		switch (suit) {
		case CLUB:
			System.out.print("c");
			break;
		case HEART:
			System.out.print("h");
			break;
		case DIAMOND:
			System.out.print("d");
			break;
		case SPADE:
			System.out.print("s");
			break;			
		}
		System.out.print(" ");
	}
	
}
