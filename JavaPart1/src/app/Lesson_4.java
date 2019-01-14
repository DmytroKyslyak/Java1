package app;

public class Lesson_4 {
	public static void main(String[] args) {
// Задача 1
		System.out.println("Задача 1");
	int a = 31;
	int b = 45;
	int n = 0;
	int i;
	for (i = a; i<=b; i++) {		
		System.out.print(i +" ");		
	n++;}
		System.out.println(" ");
		System.out.println("Количество чисел " +n);
// Задача 2	
		System.out.println("Задача 2");
	a = 3;
	b = 10;
	n = 0;
	for (i = b-1; i>a; i--) {
		System.out.print(i +" ");		
	n++;}
		System.out.println(" ");
		System.out.println("Количество чисел " +n);
// Задача 3
		System.out.println("Задача 3");
	int m = 4;
	int sum = 0;
	for (i=1; i<=m; i+=2) {		
		sum = sum+i;}
	for (i=2; i<=m; i+=2) {
		sum = sum-i;}		
	
	System.out.println("Сумма с чередующимися знаками =  " +sum);
// Задача 4
	System.out.println("Задача 4");
	n = 5;
	a = 1;
	for (i=1; i<=n; i++) {
		a = a*i;}
	System.out.println("Факториал " +n+ " равен " +a);
// Задача 5
System.out.println("Задача 5");
	a = 3;
	b = 9;
	for (i=a; i<=b; i++) {
		for (int j=i; j>=a; j--) {
		System.out.print(i);
		}
System.out.println("");
	}
// Задача 6
	System.out.println("Задача 6");
	a = 17;
	b = 3;
	int d = 0;
	int count = 0;
	for (i=b; i<=a; i+=b)
		count++; 
	for (i=1; i<=count; i++)
		d = d+b; 
	int e=a-d;
		System.out.println("Отрезок поместится " +count + " раза, остаток " +e);
//Задача 7
	System.out.println("Задача 7");
	n = 81;
	boolean z;
	for (i=1; i>=1; i++) {
		n=n/3;
	}
	/*count = 1;
	double u, t;
	int j = n;
	
	while (count<j) {
		j=j/3;
		count++;}
	u = Math.pow(3,count);
	t = n-u;
	*/
	z = (n==1)?true:false;
	System.out.println("Число " +n+ " является степенью числа 3 : " +z);	
//Задача 8
	System.out.println("Задача 8");
	double vklad = 1000;
	double pr = 5.5;
	int mes = 1;
	while (vklad<1100) {
		vklad = vklad+(vklad*pr/100);
				mes++;}
	System.out.println("Итоговая сумма вклада " +vklad+ "$");
	System.out.println("Количество месяцев для достижения суммы " +mes);
//Задача 9
	System.out.println("Задача 9");
	int nn = 123456789;
	int nn1 = nn;
	int nn2 = 0;
	int nn3 = 0;
	int oo = 1;
	double mm = nn;
	count = 0;
	while (mm>1) {
		mm = mm/10;
		count++;}
	for (i = count; i>1 ; i--)
		oo = oo*10;
	for (i=count; i>=1 ; i--) {
		nn2 = nn1%10;
		nn1 = nn1/10;
		nn3 = nn3+(nn2*oo);
		oo = oo/10;
		}
	System.out.println("Изначальное число " + nn+ " Наоборот " +nn3);
//Задача 10
	System.out.println("Задача 10");
	n = 4;	
	for (i=n; i>1; i--) {
		if (n%i==0 && i!=n)
		break;	}
	z = (i==1)?true:false;
		System.out.println("число " +n+ " натуральное : "+z);	
//Задача 11
	System.out.println("Задача 11");
	a = 10;
	b = 30;
	int c = 5;
	count = 0;
	int count1 = 0;
	if (a>c && b>=c) {
		for (i=a;i>=c;i-=c) {
			count++;}
		for (i=b;i>=c;i-=c) {
			count1++;}
		System.out.println("Квадрат поместится в прямоугольние " + count*count1+ " раз");
	}
	else {System.out.println("Не поместится");}
//Задача 12
	System.out.println("Задача 12");	
	double w = 3; // число
	int yy = 4; // степень
	int xx = 1; 
	double ww = 1;
	double dd =1;
	//u = Math.pow((-1),1);
	for (i=1; i<=yy; i++) {	
		ww = ww*w;	//возводим в степень ww
		xx = xx*(-1); //возводим в степень (-1)
		double ee = ww*xx; //ставим знак числу - или+
		dd = dd+ee; 
	}
	System.out.println(dd);
//Задача 13
	System.out.println("Задача 13");	
	int nnn = 10; // количество цифр от 0 до nnn
	int xxx = 3; // знаков в дробной части
	int xxx1 = 1;
	int xxx2 = 1;
	double nnn1 = 0;
	double nnn2 = 0;	
	double nnn3 = 0;
	double nnn4 = 0;
		// счетчик для разрядов
	for (i=0; i<xxx; i++) {	
		xxx1=xxx1*10;}
	xxx2=xxx1;

		//i=0;
		//mmm=123.0/1000;
		//System.out.println(mmm);
		for (i=0; i<nnn+1; i++) {	
		xxx2=xxx1;		
			for (int j=i; j<xxx+i; j++) {
				nnn1=j*xxx2;
				xxx2=xxx2/10;
				nnn2=nnn2+nnn1;
				//System.out.println(nnn2);
				}	
			nnn3=nnn2/(xxx1*10);
			//System.out.println(nnn3);
		nnn4=nnn3+i;
		System.out.println(nnn4);	
		nnn2=0;
		}
		
//Задача 14
System.out.println("Задача 14");	
	}
}
