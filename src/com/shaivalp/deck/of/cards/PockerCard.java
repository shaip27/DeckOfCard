package com.shaivalp.deck.of.cards;

public class PockerCard extends Card {

	PockerCard(Suit suit, int faceValue) {
		super(suit, faceValue);
	}

	@Override
	public int value() {
		if (isAceCard()) { 
			return 1; 
		} else if (faceValue >= 11 && faceValue <= 13) { 
			return 10;
		} else { 
			return faceValue;
		}
	}

	private boolean isAceCard() {
		return faceValue == 1;
	}
	
	public boolean isFaceCard() {
		return faceValue >= 11 && faceValue <= 13;
	}

}
