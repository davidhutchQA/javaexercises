package exercises;
import java.util.Random;
public class Addition {
	static int[] values= {0,1,2,3,4,5,6,7,8,9};
	static Random rand=new Random();
	
	public void add(boolean add, int val1, int val2) {

		if (val1==0)
			System.out.println(val2);
		else if (val2==0)
			System.out.println(val1);
		if (add)
			System.out.println((int)(val1+val2));
		else
			System.out.println((int)(val1*val2));
	}
	/**
	 * populate and output an array of 10 values, 0-100
	 */
	public void outputArray() {
		for (int i=0;i<values.length;i++) {
			//values[i]=rand.nextInt(100);
			System.out.println(values[i]);
		}
	}
	public void multiplyArrayValues() {
		for (int i=0;i<values.length;i++) {
			values[i]=values[i]*10;
			System.out.println(values[i]);
		}
	}
}
