package app;

import java.util.Arrays;

public class Lesson_7_2 {
	
	public static void main(String[] args) {
		System.out.println("Задача 1");
			System.out.println(weather(40, 3));
			System.out.println(weather(5, 40));
		System.out.println("Задача 2");
			System.out.println("В числе первая цифра равна последней: " + firstNum(34569));
		System.out.println("Задача 4");		
			System.out.println("Подсторок в строке: " + podstrok("мир"));
		System.out.println("Задача 6");
			adventure(3,12,10,15,25,4,6);
			System.out.println("Задача 7");	
			String s7 = "мир";
			String s77 = "мир8";
			System.out.println(twoStr(s7,s77));
		System.out.println("Задача 9");
		int [] n9 = {1,1,1,1,5};
			System.out.println("Массив сбалансированный: " + balans(n9));
		System.out.println("Задача 10");
		//Lesson_7_2 my10 = new Lesson_7_2();
			int [] n10 = {1,9,1,3,5};
			System.out.println(Arrays.toString(n10));
			n10 = sort10(n10);
			System.out.println(Arrays.toString(n10));
		}
// Задача 1	
		//Создать метод вывода на консоль погодных условий. 
		//В метод передаётся температура (в градусах Цельсия) и скорость ветра. 
		//На консоль выдаётся строки типа: «Холодно, небольшой ветер», «Тепло, безветренно» и т.п.
		public static String weather (int t, int w)	{
			String t1  = "Тепло";
			String w1  = "Небольшой ветер";
			if (t >= 35) {
				t1 = "Жарко";}
			else if (t <= 10) {
				t1 = "Холодно";	}
			if (w>35) {
				w1 = "Сильный ветер";}
			else if (w <= 5) {
				w1 = "Безветренно";}
			return (t1 +", " +w1);
			}
// Задача 2
		//Создать метод проверяющий, что у переданного числа первая цифра равна последней

		public static boolean firstNum (int n2) {
			boolean o2;
			int last = n2%10;
			int first = n2;
			while (first > 9){first = first / 10;}
			o2 = (first == last?true:false);
			System.out.println(first);
			System.out.println(last);
			return o2;
		}
// Задача 4
		//Создать метод, подсчитывающий количество вхождения подстрок в строку
		public static int podstrok(String s44) {
			String s4 = "Мы за мир мир за мир, миру мир";
			int kol4 = 0;
			String[] strings = s4.split(" "); // делим строку на отдельные слова
		    for (String word : strings) {

		        if (word.matches(s44)) {  // проверяем в цикле каждое отдельное слово
		        	// или используем contains
		        	kol4++; }}
		   
			return kol4;
		}

// Задача 6
			//Путешественник проходит каждый день несколько километров. 
			//Создать метод, выводящий на экран его путь с начала путешествия
			//(в виде "День №1 : 10км; День №2 : 7км; День №3 : 13км; "). 
			//Метод должен работать для любого количества дней путешествия.		
		public static void adventure (int...km) {
			int res = 1;
			for (int i10 = 0; i10<=km.length-1; i10++) {
			System.out.println("День №" +res+": "  +km[i10]+ " км");
			res++;}
		}
// Задача 7
		//Создать метод сравнивающий (лексиграфически) две строки
		public static String twoStr (String s7, String s77) {
			String z7 = "НЕ равны";
			int i7 = s7.compareTo(s77); 
			if (i7 ==0) {
				z7 = "Лексографически равны"; }
			return z7;
		}

// Задача 9
		//Создать метод, проверяющий, может ли массив быть "сбалансированным", 
		//т.е. разделённым на две части в каком-то месте, таким образом, 
		//чтобы сумма элементов одной части равнялась сумме элементов второй. 
		//{4,5,0,1,2,3,3};
		public static boolean balans (int [] n9) {
			boolean o9 = false;
			int sum1 = 0;
			int sum2 = 0;
			for (int i = 0; i<n9.length; i++) {
				sum1 = sum1+n9[i];
				sum2 = 0;
				for (int j = i+1; j<n9.length; j++) {
					sum2 = sum2+n9[j];}
					if (sum1 == sum2) {
						o9 = true;
						break;}}			
		return o9;}
 

		
// Задача 10
		//Реализовать метод быстрой сортировки одномерного массива с помощью рекурсивного метода.
		public static int[] sort10(int[]n10) {
			//Arrays.sort(n10);
			//String nnn = Arrays.toString(n10);
			int temp;
			boolean o10 = true;
			int [] n11 = n10;
			for (int i = 0 ; i<n10.length-1; i++) {
				if (n11[i]>n11[i+1]) {
					temp = n11[i];
					n11[i] = n11[i+1];
					n11[i+1] = temp;
					o10 = false;}}
			if (o10 == true) {
				return n11;}
			else {
				return sort10(n11);
			}
			
		}
}