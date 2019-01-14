package app;

public class Lesson_2 {
	public static void main(String[] args) {
		int l = 256;
		int m = l/100;
		System.out.println("Расстояние : " +m+ " метра");
		int ch = 59;
		int a = ch/10;
		int b = ch%10;
		int c = b*10+a;
		System.out.println("Настоящее число " +ch+ " Наоборот " +c);
		a = l/100;
		b = l%100;
		c = b/10;
		m = b%10;
		int li = (m*100)+(c*10)+a;
		System.out.println("Настоящее число " +l+ " Наоборот " +li);
		a = 20;
		b = 30;
		c = 7;
		int e,f,g,s;
		if (c>a||c>b) {
			System.out.println("Нет вариантов размещения");
		}
		else {e = a/c;
		f = b/c;
		g = e*f;
		s = (a*b)-(g*(c*c));	
			System.out.println("В прямоугольник помещается " +g+ " квадратов");
			System.out.println("Площадь незанятой части прямоугольника " +s);
		}
	}
}

