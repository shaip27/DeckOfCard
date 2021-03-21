package com.shaivalp.deck.of.cards;

import java.util.Random;

public class DeckCardUtil {
	
	public static int getRandomIntInRange(int min, int max) {
		 Random random = new Random();
		 return random.nextInt(max - min) + min;
	}

}
