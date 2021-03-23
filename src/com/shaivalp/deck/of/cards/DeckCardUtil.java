package com.shaivalp.deck.of.cards;

public class DeckCardUtil {
	
	public static int randomInt(int n) {
		return (int) (Math.random() * n);
	}
	
	public static int getRandomIntInRange(int min, int max) {
		return randomInt(max + 1 - min) + min;
	}

}
