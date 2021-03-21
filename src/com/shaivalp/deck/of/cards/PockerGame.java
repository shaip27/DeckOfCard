package com.shaivalp.deck.of.cards;

import java.util.ArrayList;

public class PockerGame extends CardGame {
	
	private Deck<PockerCard> deck;
	private PockerHand[] hands;
	
	public PockerGame(int numPlayers) {
		hands = new PockerHand[numPlayers];
		for (int i = 0; i < numPlayers; i++) {
			hands[i] = new PockerHand();
		}
	}
	
	@Override
	public void initializeDeck() {
		ArrayList<PockerCard> cards = new ArrayList<PockerCard>();
		for (int faceValue = 1; faceValue <= 13; faceValue++) {
			for (int suitIndex = 0; suitIndex <= 3; suitIndex++) {
				Suit suit = Suit.getSuitFromValue(suitIndex);
				PockerCard card = new PockerCard(suit, faceValue);
				cards.add(card);
			}
		}
		deck = new Deck<PockerCard>();
		deck.initDeckOfCards(cards);
		deck.shuffle();	
	}
}
