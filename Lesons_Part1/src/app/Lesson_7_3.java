package app;

public class Lesson_7_3 {
	public static void main(String[] args) {
		System.out.println("Задача 1");
		Lesson_7_3 my1 = new Lesson_7_3();
		System.out.println("Штраф: " +my1.speed(82,2));
		System.out.println("Задача 2");
		Lesson_7_3 my2 = new Lesson_7_3();
		System.out.println(my2.diapazon(8));
		System.out.println("Задача 3");
		System.out.println("Первая цифра равна последней: " +firstLast(10071));
		System.out.println("Задача 4");
		System.out.println("Факториал: " +fak(5));
		System.out.println("Задача 5");
		System.out.println("В этом месяце дней: " +day5(2,1300));
		System.out.println("Задача 7");
		int [] n7 = {1,2,1,2,1};
		System.out.println("Число повсюду: " +every(n7,2));
		}
		
	
// Задача 1
		//Вы едите слишком быстро и полицейский останавливает вас. 
		//Напишите код: если скорость меньше или =60 штраф 0.
		// Если 61-80 штраф 1. Если 81 и больше штраф 2
		// если день остановки ваш день рождения скорость может быть на 5 выше.
		public int speed (int s, int d) {
		int shtraf =0;
		int my_d1 = 2;
		if (d==my_d1) {s = s-5;}
		if (s>=61 && s<=80) {shtraf = 1;}
		if (s>=81) {shtraf = 2;}
		return shtraf;
		
		}
// Задача 2
		// Дано целое число n. Вернуть true, если n находится в диапазоне от 1 до 10 включительно.
		// В противном случае возвращает false.
	public boolean diapazon (int n2) {
		boolean z2 = false;
		if (n2<=10) {
			z2 = true;}
		return z2;
	}	
// Задача 3
	//создать метод проверяющий, что у переданного числа первая цифра равна последней.
	public static boolean firstLast (int n3) {
		boolean o3 = false;
		int first = n3;
		while (first>=9) {
			first = first/10;}
		int last = n3%10;
		if (first == last) {
			o3 = true;}
		System.out.println(first);
		System.out.println(last);
		return o3;	}
// Задача 4
	//Создать метод вычисляющий факториал числа n.
	public static int fak (int n4) {
		int f4 = 1;
		for (int i=1; i<n4+1; i++) {
			f4 = f4*i;}
		return f4;}
// Задача 5
	//Создать метод вычисляющий количество дней в месяце определенного года (с учетом высокосного года)
	public static int day5 (int m5, int y5) {
		int n5;
		double vysokos = y5%4;
		double vysokos1 = y5%400;
		double vysokos2 = y5%100;
		if (m5 == 2 && vysokos!=0) {	
			n5 = 28;}
		else if (m5 == 2 && vysokos==0 && vysokos2==0 & vysokos1 !=0) {	
			n5 = 28;}
		else if (vysokos==0) {
			n5 = 29;}
		else if (m5 == 1 || m5 ==3 ||m5 ==5 ||m5 == 7 ||m5 == 8 ||m5 == 10 || m5 ==12) {
			n5 = 31;}
		else {n5 = 30;}
	return n5;
	}
// Задача 7
	//Создать метод, возвр true, если заданное число находится "повсюду" в целочис массиве.
	//Под повсюду понимать: при рассмотрении любой пары рядомстоящих элементов массива, 
	//одним из элементов будет искомое число, т.е 
	
	public static boolean every (int [] n7, int i7) {
		boolean o7 = false;
		for (int i=0; i<=n7.length-3; i++) {
			if (n7[i] == i7 && i7 == n7[i+2]) {
				o7 = true;				
				break;
			}}
			return o7;}

}