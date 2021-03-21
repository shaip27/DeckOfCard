package com.shaivalp.deck.of.cards;

public class CardGameFactory {
	public CardGame getCardGame(CardGameType cardGameType, int numberOfPlayer) {
		CardGame cardGame = null;
		if(cardGameType==CardGameType.POCKER) {
			return cardGame = new PockerGame(numberOfPlayer);
		}
		return cardGame;
	}

}
