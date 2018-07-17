package exercises;


public class Program {
	public static void main(String[] args) {
		
		level2.People test=new level2.People(12);
		
		test.addPerson("David Hutchinson", 32, "Trainee");
		System.out.println(test.toString());
		
		System.out.println(test.findPerson("David Hutchinson"));
		
		/*
		level2.TooHot test=new level2.TooHot();
		if (test.tooHot(91, false)) {
			System.out.println("in range");
		}else
			System.out.println("Out of range");
		*/
		
		//Hello test = new Hello();
		
		/*
		level2.UniqueSum test = new level2.UniqueSum();
		System.out.println(test.sum(1,3,2));
		*/
		
		/*
		level2.Blackjack test= new level2.Blackjack();
		test.blackJack(19,21);
		*/
		
		/*
		Addition test=new Addition();
		test.add(false,12, 11);
		test.outputArray();
		test.multiplyArrayValues();
		*/
	}
}
