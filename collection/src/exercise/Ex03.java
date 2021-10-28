package exercise;

import java.util.ArrayList;
import java.util.List;

import bean.PlayingCard;

public class Ex03 {
	private static String[] ranks = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };
	private static String[] suits = { "Hearts", "Spades", "Dimonds", "Clubs" };

	public static void main(String[] args) {
		List<PlayingCard> deck = getDeck();
		for (PlayingCard card : deck) {
			System.out.println(card);
		}
		
		
	}
	
	private static List<PlayingCard> getDeck(){
		List<PlayingCard> deck = new ArrayList<>();
		for (int i = 0; i < suits.length; i++) {
			for (int j = 0; j < ranks.length; j++) {
				deck.add(new PlayingCard(ranks[j], suits[i]));
			}
		}
		return deck;
		
	}
	
	
}
