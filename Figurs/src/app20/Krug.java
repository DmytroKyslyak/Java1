package app20;

public class Krug extends Figura{

	public double s3;


	public Krug(double s3) {
		this.s3=s3;
	}
	
	public double Pl() {
		return s3*3.14;
	}
	
	public double getS3() {
		return s3;
	}

	public void setS3(double s3) {
		this.s3 = s3;
	}	

}