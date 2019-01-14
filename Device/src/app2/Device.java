package app2;

import java.util.Random;

public class Device extends Main{
	public String name;
	public int power;
	protected static int count; // переменная для колва процессоров
	
/*	
	public int Compare(Device d1, Device d2){
		if(d1 instanceof Computer && d2 instanceof Computer){			
			if(((Computer)d1).getRam()==((Computer)d2).getRam()){return 0;}
			if(((Computer)d1).getRam()>((Computer)d2).getRam()){return 1;}
			else{return -1;}}				
		if(d1 instanceof Tv && d2 instanceof Tv){
			if(((Tv)d1).getDiagonal()==((Tv)d2).getDiagonal()){return 0;}
			if(((Tv)d1).getDiagonal()>((Tv)d2).getDiagonal()){return 1;}
			else{return -1;}}		
		else{
			if(d1.getPower()==d2.getPower()){return 0;}
			if(d1.getPower()>d2.getPower()){return 1;}
			else{return -1;}}
		
	}
	*/
//}
	

	// метод сравнение 2-х приборов	
			public int compDevs(Device dev, Device dev1) {
				
				//int c =5;
				if(dev instanceof Computer && dev1 instanceof Computer) {
					int a = ((Computer)dev).getRam();
					int b = ((Computer)dev1).getRam();
					if (a<b) {	return -1;}
					if (a>b) {	return 1;}
					else {return 0;}
					//System.out.println("Comp ");
					}
					
				if(dev instanceof Tv && dev1 instanceof Tv) {
					int a = ((Tv)dev).getDiagonal();
					int b = ((Tv)dev1).getDiagonal();
					if (a<b) {return -1;}
					if (a>b) {return  1;}
					else {return 0;}
					//System.out.println("Tv ");
					}
				
				
				else {
					int a2 = dev.getPower();
					int b2 = dev1.getPower();
					if (a2<b2) {return -1;}
					if (a2>b2) {return  1;}
					else {return 0;}
					//System.out.println("Other Device ");
				}				
}	
			
	
	// ID метод случайная генерация 1-го числа
	public static int nextId1() { 
	Random random = new Random(); 
	int nextId = random.nextInt(10);
	return nextId;
	}
	// ID метод случайное +1
	public static int id = nextId1(); 
	public int createId() {  
		id++;
		return id;}
	// метод подсчета кол-ва процессоров
	public static  int getCount() {		
		return count;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPower() {
		return power;
	}
	public void setPower(int power) {
		this.power = power;
	}
// метод устанавливающий мощность устройства 	
public Device createDevice(int type, int power) {
	Device res = null;
		switch (type) {
		case 1:
			res = new Computer();
			break;
		case 2:
			res = new Pleer();
			break;
		case 3:
			res = new Server();
			break;
		case 4:
			res = new Tv();
			break;
		}
res.setPower(power);	
return res;}

// метод подсчета общей мощности
	public final int sumPow(Device dev[]) {
		int sum = 0;
		for (int i = 0; i<dev.length; i++) {
			sum = sum+dev[i].getPower();
		}
		return sum;
}
// метод подсчета RAM 
		public int getCounter(Device dev[]) {
			int count = 0;
			for (int i = 0; i<dev.length; i++) {
				if(dev[i] instanceof Computer) {
					count = count+((Computer)dev[i]).getRam();
				}
			}
			return count;

	}
}
			