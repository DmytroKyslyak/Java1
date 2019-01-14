package app20;

public class Kvadrat extends Figura{
	
	public double s;
	public Kvadrat(double s) {
		this.s=s;
	}
	
	public double Pl() {
		return s*s;
	}
	
	public double getS() {
		return s;
	}

	public void setS(double s) {
		this.s = s;
	}

}
