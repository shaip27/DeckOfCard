package com.shaivalp.deck.of.cards;

import java.util.ArrayList;

public class PockerGame extends CardGame {
	
	private Deck<PockerCard> deck;
	private PockerHand[] hands;
	private PockerHand riverHand;
	
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

	public boolean dealInitial() {
		for (PockerHand hand : hands) {
			PockerCard card1 = deck.dealCard();
			PockerCard card2 = deck.dealCard();
			if (card1 == null || card2 == null) {
				return false;
			}
			hand.addCard(card1);
			hand.addCard(card2);	
		}
		return true;
	}
	
	public boolean riverInitial() {
		riverHand = new PockerHand();
		for(int i =0;i < 5; i++) {
			PockerCard reiverCard = deck.dealCard();
			riverHand.addCard(reiverCard);
		}
		return true;
	}
	
	public void printHandsAndScore() {
		for (int i = 0; i < hands.length; i++) {
			System.out.print("Hand " + i + " (" + hands[i].score() + "): ");
			hands[i].print();
			System.out.println("");
		}
		System.out.print("River Hand  (" + riverHand.score() + "): ");
		riverHand.print();
	}
}
