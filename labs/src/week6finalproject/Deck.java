package week6finalproject;

import java.util.ArrayList;

public class Deck {
	private List <String> shuffledDeck = new ArrayList<>();
	private List<String> player1Hand = new ArrayList<>();
	private List<String> player2Hand = new ArrayList<>();
	private String drawCard;
	
	@SuppressWarnings("unchecked")
	public Deck() {
 Card cards = new Card();
 shuffledDeck.addAll(cards.shuffle());
	}
	public List<String> getShuffledDeck() {
 return shuffledDeck;
	}
	public void setShuffledDeck(List<String> shuffledDeck) {
 this.shuffledDeck = shuffledDeck;
	}
	
	public List<String> getPlayer1Hand() {
 return player1Hand;
	}
	public void setPlayer1Hand(List<String> player1Hand) {
 this.player1Hand = player1Hand;
	}
	public List<String> getPlayer2Hand() {
 return player2Hand;
	}
	public void setPlayer2Hand(List<String> player2Hand) {
 this.player2Hand = player2Hand;
	}
	
	public String getDrawCard() {
 return drawCard;
	}
	public void setDrawCard(String drawCard) {
 this.drawCard = drawCard;
	}
}
