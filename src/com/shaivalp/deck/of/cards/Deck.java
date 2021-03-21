package com.shaivalp.deck.of.cards;

import java.util.ArrayList;

public class Deck<T extends Card>  {
	
	private ArrayList<T> cards;
	private int usedCardInDeck = 0;
	
	public void initDeckOfCards(ArrayList<T> deckOfCards) {
		cards = deckOfCards;
	}
	
	public void shuffle() {
		for (int currentIndex = 0; currentIndex < cards.size(); currentIndex++) {			
			 int newIndex = DeckCardUtil.getRandomIntInRange(currentIndex, cards.size() - currentIndex - 1);
			 swap(currentIndex, newIndex);
		}
	}

	private void swap(int currentIndex, int newIndex) {
		T card1 = cards.get(currentIndex);
		T card2 = cards.get(newIndex);
		cards.set(newIndex, card1);
		cards.set(currentIndex, card2);
	}
	
	
	public int remaingAvailableCards() {
		return cards.size() - usedCardInDeck;
	}
	
	public T dealCard() {
		if (remaingAvailableCards() == 0) {
			System.out.println("No cards left to deal");
			return null;
		}
		T card = cards.get(usedCardInDeck);
		usedCardInDeck++;
		return card;
	}
	
	public void print() {
		for (Card card : cards) {
			card.print();
		}
	}

}
