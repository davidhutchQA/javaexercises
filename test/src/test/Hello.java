package test;

import java.util.Random;


public class Hello {


	static final char[] hello= {'H','e','l','l','o',10,'W','o','r','l','d',10};
	public Hello() {
		Random rand=new Random();
		printHelloWorld(1+rand.nextInt(19));
	}
	public void printHelloWorld(int exclaims) {
		for (int i=0;i<hello.length;i++) {
			System.out.print(hello[i]);
		}	
		for (int i=0;i<exclaims;i++)
			System.out.print("!");
	}
}
