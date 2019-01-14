package app;

public class Lesson_8_Complex {
	double r;
	double im;
	public double getR() {
		return r;
	}
	public void setR(double r) {
		this.r = r;
	}
	public double getIm() {
		return im;
	}
	public void setIm(double im) {
		this.im = im;
	}
	Lesson_8_Complex(double r, double im){ // конструктор
		this.r = r;
		this.im = im;
	}
	double getModule() {
		return Math.sqrt(r*r+im*im);
	}
	Lesson_8_Complex add(Lesson_8_Complex value) {
		return new Lesson_8_Complex(this.r+value.getR(),this.im+value.getIm());
		}
	Lesson_8_Complex multiply(Lesson_8_Complex value) {
		double rr = this.r*value.getR()-this.im*value.getIm();
		double rim = this.r*value.getIm()+this.im*value.getR();
		return new Lesson_8_Complex(rr,rim); 
	}
}
