package app;

public class Lesson_1 {
	public static void main(String[] args) {
		int type = 1;
	String devName;
	switch (type) {
	    case 1:  devName = "Tv";
	             break;
	    case 2:  devName = "Pleer";
	             break;
	    case 3:  devName = "Server";
	             break;
	    default: devName = "Не знаем такого";
        break;}
        
    System.out.println(devName);   
	
	}
}
