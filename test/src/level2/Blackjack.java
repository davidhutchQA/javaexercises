package level2;

public class Blackjack {

	public void blackJack(int val1, int val2) {
		if (val1-val2>0&&val1<=21)
			System.out.println("Value 1: "+val1);
		else if (val2-val1>0&&val2<=21)
			System.out.println("Value 2: "+val2);
		else
			System.out.println(0);
	}
}
