package app;

//import java.util.Scanner;

public class Lesson_6 {

	public static void main(String[] args) {
		//System.out.println("Задача №1");
		//System.out.print("Новая строка: " +probel("q", "_"));
//Задача №2	
		/*
		System.out.println("Задача №2");
		Scanner in = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String my2 = in.nextLine();  
        System.out.println("Моя строка: " +my2);
        System.out.println("Символов: " +my2.length());
        String[] part2 = my2.split(" ");
        System.out.println("Слов: " +part2.length);
        char[] ch2 = my2.toCharArray();
        for (int i3 = ch2.length-1; i3>= 0; i3--) {
        	System.out.print(ch2[i3]);}
        System.out.println();
        for (int i2 = part2.length-1; i2>= 0; i2--) {
        	System.out.print(part2[i2] +" ");}
        }
        */
//Задача №3
		/*
		System.out.println("Задача №3");
		String [] p3 = {"Вася", "иди", "в", "пизду"};
		String max = p3[0];
		for (int i = 1; i<=p3.length-1; i++) {
			if (max.length() <= p3[i].length()) {
				max = p3[i];
			}}
		System.out.println(max);	
		String vse = max;
		for (int j = 0; j<=p3.length-1; j++) {
			if (p3[j] == max) {
				continue;}
				vse = vse + " " +p3[j];}
		System.out.println(vse);
		}
		*/
//Задача №4	
		/*
		System.out.println("Задача №4");
		String s4 = "Dear friend Дорогой друг";
		char[] ch4 = s4.toCharArray();
		int count4 = 0;
		int count4rus = 0;
        for (int i4 = 0; i4 <= ch4.length-1; i4++) {
        	char b4 = ch4[i4];
        if (b4 >= 'a' && b4 <= 'z') {
        	count4++;}
        if (b4 >= 'а' && b4 <= 'я') {
        	count4rus++;}
        	}
        System.out.println(count4);
        System.out.println(count4rus);
        */
//Задача №5
		System.out.println("Задача №5");
		int n1 = 5;
		int n2 = 6;
		String s1 = "Добро пожаловать";
		String s2 = "Идите в жопу";
		char[] ch1 = s1.toCharArray();
		char[] ch2 = s2.toCharArray();
		String res = "";
		for (int i = 0; i<=n1; i++) {
			res = res + ch1[i];
			}
		for (int j = ch2.length-n2; j<=ch2.length-1; j++) {
			res = res + ch2[j];
		}
		System.out.print(res);	
				
//Задача №1
	/*
	public static String probel(String s11, String s12) {
		Scanner in = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String my1 = in.nextLine();  
        System.out.println("Моя строка: " +my1);
        String ss = my1.replace(s11,s12);
		return ss;		
	}
	*/
		
	}
}
