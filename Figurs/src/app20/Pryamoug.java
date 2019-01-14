package app20;

public class Pryamoug extends Figura{
	
	public double s1;
	public double s2;
	public Pryamoug(double s1, double s2) {
		this.s1=s1;
		this.s2=s2;
	}
	
	public double Pl() {
		return s1*s2;
	}
	
	public double getS1() {
		return s1;
	}

	public void setS1(double s1) {
		this.s1 = s1;
	}
	public double getS2() {
		return s2;
	}

	public void setS2(double s2) {
		this.s2 = s2;
	}
}



