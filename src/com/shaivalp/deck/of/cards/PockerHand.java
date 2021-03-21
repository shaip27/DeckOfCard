package com.shaivalp.deck.of.cards;

public class PockerHand extends Hand<PockerCard> {
	
	public int score() {
		return 0;
	}
	
	public boolean isRoyalFlush() {
		return false;
	}
	
	public boolean isFlush() {
		return false;
	}
	
	public boolean isStraightFlush() {
		return false;
	}
	
	public boolean isThreeOfAKind() {
		return false;
	}
	
	public boolean isTwoPair() {
		return false;
	}
	
	public boolean isPair() {
		return false;
	}

}
