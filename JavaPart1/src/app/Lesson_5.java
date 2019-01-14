package app;

public class Lesson_5 {
	public static void main(String[] args) {
	/*int n = 15;
	int i;
	for (i=1; i<n; i++) {
		if ((n%i)==0) {
		System.out.println(i);}
	}
	
	for (int n=1; n<=20; n++) {
		int n2 = n*n;
		int n3 = n2*n;
		int n4 = n3*n;
		//System.out.println("n= " +n+ " n2" +n2+ " n3" +n3+ "n4 " +n4);
		System.out.format(" %1$2d %2$3d %3$4d %4$6d %n", n,n2,n3,n4);
	}
	*/
		int n = 5;
		double x = 3;
		double x1 = x;
		for (int i=1; i<n; i++) {
			x1=x1*x;			
		}
		System.out.println(x1);
//Задача 2
		x1=0;
		for (int i=1; i<=n; i++) {
			x1+=i;			
		}
		System.out.println(x1);
//Задача 3
		n = 5;
		int sum = 0;
		for (int i=1; i<=n-1; i++) {
			sum+=2*i-1;	
				}
		System.out.println(sum);
//Задача 4
		n = 5;
		int sum1 = 0;
		for (int i=1; i<=n; i++) {
			sum1+=(i*i);
		}
		System.out.println(sum1);
//Задача 5
		n = 8128;
		int sum2 = 0;
		boolean res = false;
		for (int i=1; i<n; i++) {
			if (n%i==0) {
			sum2 = i+i;}
			}
		if (n==sum2)
			res = true;
		System.out.println(res);
//Задача 6
		double an = 2.0;
		x = 1.0;
		double sum3 = 0.0;
		n = 0;
			while (an !=0.0) {
			sum3+=an;
			n++;
			an*=x/n; }	
				System.out.println(sum3);
//Задача 7			
	}

}
