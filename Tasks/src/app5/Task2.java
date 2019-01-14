package app5;

public class Task2 {

	//Создать класс Task2, в котором дожна быть функция isOdd, 
	//кторорая принимает параметр число(int) и возвращает назад true если число четное, и false если не четное
	public static void main(String[] args) {
		Task2 ch = new Task2();
				
		System.out.println(ch.isOdd(6));
		
		
	}
	public boolean isOdd(int a) {
		boolean b;
		if (a%2 == 0) {
			b = true;} 
		else {b = false;}
		
		
		return b;
	}
	
}
