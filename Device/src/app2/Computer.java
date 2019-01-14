package app2;

//import java.util.Scanner;

public class Computer extends Device {
	public int Ram;
	// устанавливаем границы памяти
	//public static int min = 64;
	//public static int max = 1024;
	public static int ram;
	
	public int getRam() {
		return this.Ram;}
	
	public void setRam(int ram) {
	Ram = ram;
	}
	
/*
// вызываем Ram сравнивая с границами
	public int getRam() {
		if (Ram <=64 || Ram >= 1000) {
			Ram = 0;
			return this.Ram;}
		return this.Ram;}
	

	*/
// метод устанавливает RAM со сканера.
	/*
	public void setRam(int ram) {
		Scanner in2 = new Scanner(System.in);
        System.out.println("Минимум " +Computer.min + " Максимум " +Computer.max+" Введите Ram: ");
        ram = in2.nextInt();
        in2.close();
        if (ram >= min && ram <=max) {
        	Ram = ram;}
        else {
        	System.out.println("Ошибка. Начните сначала ");	}
	}
	*/
   // Метод перевода в Мб
	public double perevodMb() {
		return (this.Ram)/1024/1024;
	}
	// Метод перевода в Гб
	public double perevodGb() {
		return (this.Ram)/1024/1024/1024;
	}
	// Метод ограничения памяти
	
	
}
