package app;

public class Main {
	public static void main(String[] args) {
		Lesson_8_Complex a = new Lesson_8_Complex(2.0,3.0);
		Lesson_8_Complex b = new Lesson_8_Complex(5.0,7.0);
		Lesson_8_Complex c = a.add(b);
		System.out.println(c);
		}
}
