package exercises;

public class Program {
static String hello ="Hello World!";
	public static void main(String[] args) {
		TooHot test=new TooHot();
		if (test.tooHot(91, false)) {
			System.out.println("in range");
		}else
			System.out.println("Out of range");
		
		
		//UniqueSum.uniqueSum(2, 1, 2);
		
		//Blackjack test= new Blackjack();
		//test.blackJack(19,21);
		
		//Addition test=new Addition();
		//test.add(false,12, 11);
		//test.outputArray();
		//test.multiplyArrayValues();
	}
}
