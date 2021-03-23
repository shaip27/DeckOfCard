package com.shaivalp.deck.of.cards;

public class PlayCardGame {

	public static void main(String[] args) {
		
		CardGameFactory gameFactory = new CardGameFactory();
		int numberOfPlayer = 3;
		
		PockerGame pockerGame =  (PockerGame) gameFactory.getCardGame(CardGameType.POCKER, numberOfPlayer);
		pockerGame.initializeDeck();
		
		boolean success = pockerGame.dealInitial();
		if (!success) {
			System.out.println("Out of cards.");
		} else {
			System.out.println("-- Initialized Pocker Hands --");
		}
		
		if (!pockerGame.riverInitial()) {
			System.out.println("Out of cards.");
		} else {
			System.out.println("-- Initialized Pocker River --");
		}
		
		pockerGame.printHandsAndScore();
		
	}

}
