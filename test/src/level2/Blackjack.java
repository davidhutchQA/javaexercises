package level2;

public class Blackjack {
/**
 * Which card is closer to 21? if both >=21, both lose
 * @param card1
 * @param card2
 */
	public void blackJack(int card1, int card2) {
		if (card1-card2>0&&card1<=21)
			System.out.println("Value 1: "+card1);
		else if (card2-card1>0&&card2<=21)
			System.out.println("Value 2: "+card2);
		else
			System.out.println(0);
	}
}
