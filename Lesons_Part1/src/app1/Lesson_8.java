package app1;

public class Lesson_8 {
	
	static Woker novy = new Woker("���������", 1);
	static Woker spec = new Woker("����������", 3);
	static Woker master = new Woker("������", 5);
		public static void main(String[] args) {
					
		System.out.println(novy.getWork() +" ������ " +novy.getDetals() +" ������, ������� - " +agregat(15,novy));	}	
	
		static int agregat(int detUstr, Woker rab)	{
			int agrDet=0;
			agrDet = rab.getDetals() + detUstr;
		return agrDet;
}
}
/*
static Woker novy = new Woker("���������", 1);
static Woker spec = new Woker("����������", 3);
static Woker master = new Woker("������", 5);
	public static void main(String[] args) {
	//Woker d = spec;	
	//System.out.println(d.getWork()); }}
	System.out.println(agregat(15,novy));	}	

	static int agregat(int detUstr, Woker rab)	{
		int agrDet=0;
		agrDet = rab.getDetals() + detUstr;
	return agrDet;*/

		
		/*
		System.out.println(agregat(5,"����������"));			
	}	
	public static int agregat(int detUstr, String rab)	{
		int agrDet=0;
		if (rab == "���������") {
			agrDet = 1;	}	
		else if (rab == "����������") {
			agrDet = 3;	}
		else if (rab == "������") {
			agrDet = 5;	}
		agrDet = agrDet + detUstr;
		return agrDet;
	}
}*/
/*	
class Woker {
		int detals;
		String work;
		Woker(String work, int detals){
			this.detals = detals;
			this.work = work;}
		
		Woker novy = new Woker("���������", 1);
		Woker spec = new Woker("����������", 3);
		Woker master = new Woker("������", 5);
			//System.out.println(novy.detals);
			//System.out.println(spec.detals);
			//System.out.println(master.detals);
		
		
		}
*/



