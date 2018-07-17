package test;

import java.util.Scanner;

public class Testing {
	static Scanner input;

	public static void main(String[] args) {
		input=new Scanner(System.in);
		addInput();
//				int[] values=new int[args.length];
//			for(int i:values) {
//				try {
//				values[i]=Integer.valueOf(args[i]);		
//				}
//				catch (NumberFormatException e) {
//					values[i]=0;
//					System.out.println("Error with param "+args[i]+" : Must be a number, defaulting to zero");
//				}
//			}
//			System.out.println("The resulting sum of all params is "+add(values));
	}

	/**
	 * Add together all integer values in array
	 * @param values array of integer values to add
	 * @return summation of values
	 */
	public static int add(int[] values) {
		int result=0;
		for (int i=0;i<values.length;i++) {
			result+=values[i];
		}
			return result;
	}
	
	public static int addInput() {
		int value=0;
		while (value==0) {
			try {
				value=Integer.valueOf((input.nextLine()));
				if (value==0)
					System.out.println("Must not be zero");
			}
			catch(Exception e) {
				value=0;
				System.out.println("Not a number");
			}
		}
		System.out.println("User input "+value);
		return value;
	}
}
