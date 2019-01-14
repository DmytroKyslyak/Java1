package app;

public class Lesson_7 {
	public int [] wheels;
	
	public static void main(String[] args) {
		Lesson_7 weather = new Lesson_7();
		System.out.println(weather.getWeather(40, 4));
		System.out.println(weather.getWeather(10, 14));
		System.out.println(weather.getWeather(0, 15));
		Lesson_7 weather1 = new Lesson_7();
		System.out.println(weather1.wheels(1,1,1,1));
		System.out.println(weather1.wheels(1,1));
		System.out.println(weather1.wheels());
		Lesson_7 weather2 = new Lesson_7();
		System.out.println(weather2.loneSum(3,3,3));
		Lesson_7 weather3 = new Lesson_7();
		System.out.println(weather3.divid(30));
		Lesson_7 weather4 = new Lesson_7();
		System.out.println(weather4.eleven(55));
		Lesson_7 weather5 = new Lesson_7();
		System.out.println(weather5.six(2,4));
		Lesson_7 weather7 = new Lesson_7();
		System.out.println(weather7.sum7(10,2));
}
	
// Задача 1
	public String getWeather(double t, double c) {
	String S1;
	String S2;
		if (t>35) {
			S1="Очень Жарко";	}
		else if (t>25) {
			S1="Жарко";	}
		else if (t>18) {
			S1="Тепло";	}
		else {
			S1="Холодно";	}		
		if (c>15) {
			S2="Буря";	}
		else if (c>5) {
			S2="Сильный ветер";	}
		else {
			S2="Штиль";	}
	return S1+S2;}		
// Задача 2
	public int wheels(int...wheels) {
		this.wheels=wheels;
		int res = 0;
		for(int wheel:wheels) {
			res+=wheel;
		}
		if (res==0) {
			return 0;			
		}
		return res;	}
// Задача 3
	//Дано 3 числа a,b,c типа int. Вернуть их сумму. 
	//Если одно из значений совпадает оно не учитывается в сумме.
    //loneSum(1,2,3)->6 
    //loneSum(3,2,3)->2
    //loneSum(3,3,3)->0
	public int loneSum(int a, int b, int c) {
		int sum = 0;
		if (a==b && b==c) {
			sum = 0;}
		else if(a==b) {
			sum = c;}
		else if (b==c) {
			sum = a;}
		else if (a==c) {
			sum = b;}
		else
		sum = a+b+c;
		return sum;	}	
// Задача 4
	//Дано целое число n. Вернуть true, если оно делится или на 3 или на 5. 
	//Если число делится и на 3 и на 5 вернуть  false
	public boolean divid(int n) {
		boolean z = false;
		if (n%3==0 && n%5==0) {
			z = false;}
		else if (n%3==0 || n%5==0) {
			z = true;}
		return z;}
// Задача 5
	//Дано число n. Вернуть true если оно кратно 11.
	public boolean eleven(int n5) {
		boolean z5 = false;
		if (n5%11==0) {
			z5 = true;}
		return z5;}
// Задача 6
	//Дано 2 числа a и b типа int. 
	//Вернуть true, если одно из чисел = 6 или если их сумма или разница = 6. 
	//В противном случае вернуть false.
	public boolean six(int a, int b) {
		boolean z6 = false;
		if (a==6 || b==6) {
			z6 = true;}
		else if (a+b==6 || a-b==6 || b-a==6) {
			z6 = true;}
		return z6;}	
// Задача 7
	//Дано 2 числа типа int a и  b. 
	//Вернуть их сумму. Если сумма попадает в диапазон от 10 до 19 включительно возвращать 20.
	public int sum7(int a7, int b7) {
		int sum77 = a7+b7;
		if (10 <= sum77 && sum77<= 19) {
			sum77 = 20;
		}
		return sum77;}
	
}
