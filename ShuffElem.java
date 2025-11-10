import java.util.*;

public class ShuffElem {
	public static void main(String[] args){
		ArrayList<String> cards = new ArrayList<>();

		cards.add("King");
		cards.add("Queen");
		cards.add("Jack");
		cards.add("Ace");
		cards.add("Joker");

		System.out.println("Unshuffled cards: " + cards);
		Collections.shuffle(cards);
		System.out.println("Shuffled cards: " + cards);
	}
}
