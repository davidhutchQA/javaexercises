package exercises;

public class Hello {
	private final static String hello="Hello World!";
	public Hello() {
		textOutput("Hello World!");
		textOutput(hello);
	}
	public static void textOutput(String text) {
		System.out.println(text);
	}
}
