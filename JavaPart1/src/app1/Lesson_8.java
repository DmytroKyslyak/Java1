package app1;

public class Lesson_8 {
	
	//static Woker novy = new Woker("Новенький", 1);
	//static Woker spec = new Woker("Специалист", 3);
	//static Woker master = new Woker("Мастер", 5);
		public static void main(String[] args) {
					
System.out.println(Woker.novy.getWork() +" делает " 
					+Woker.novy.getDetals() +" деталь, агрегат - " 
					+Woker.agregat(15,Woker.novy));	
}	
}
