package app20;

public class Main {
	public static void main(String[] args) {
		
		Figura[] a = new Figura[3];
		a[0] = new Kvadrat(7);
		a[1] = new Krug(6);
		a[2] = new Pryamoug(5,8);
		double m = 0; 
		for (Figura i : a) {
		//double q = a[i].Pl();
		double q = i.Pl();
			m += q;			
				System.out.println(q);}
				System.out.println(m);
	}

}
