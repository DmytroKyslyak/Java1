package app;

public class Lesson_6 {
	public static void main(String[] args) {
// Задача 1
		//Дан целочисленный массив из 3 элементов. Верните сумму всех элементов массива
		int [] n1 = {1,3,5}; 
		int sum1 = 0;
			for (int i=0; i<n1.length; i++) {
				sum1 += n1[i];}
			 System.out.println(sum1); 
		
// Задача 2
		//найти среднее значение масива. При нахождении ср. зн. мах и мин значение игнорировать.
		//Если мах и мин значение повторяются несколько раз игнорировать их только 1 раз. 
		//Считать что длина масива больше или = 3
		//centerAverage([1,2,3,4,100]) ---- 3
		//centerAverage([1,1,5,5,10,8,7]) ----5
			int [] n2 = {1,1,5,5,10,8,7}; 
			 int max2 = n2[0];
			 int min2 = n2[0];
			 int sum2 = 0;
			 int count2 = 0;
			 for (int i2=0; i2<n2.length; i2++) {
				 sum2 = sum2+n2[i2];
				 if (n2[i2]>max2){ 
			 	max2 = n2[i2];}
				 if (n2[i2]<min2){ 
					 	min2 = n2[i2];}	
				 count2++;
				 }
			 sum2 = sum2-max2-min2;
			 count2 = count2-2;
			 sum2 = sum2/count2;
			 System.out.println("Среднее значение " +sum2);
			 
// Задача 3
		//Дан массив из целых чисел. Вывести на консоль true если массив не содержит 1 и 3. 
		//В противном случае false
			 //lucky13([0,2,2]) --- true
			 //lucky13([1,2,3]) ---- false
			 int [] n3 = {2,13,5}; 
			 boolean z3 = true;
			 for (int i3:n3) {
				 if (i3==1||i3==3) {
					 z3=false; }}
			 System.out.println(z3);
// Задача 4
		//Дан массив из целых чисел. Вывести на консоль true если сумма всех 2 в массиве = 8.
		//В противном случае вывести false
			 int [] n4 = {2,13,5,2,2}; 
			 boolean z4 = false;
			 int sum4 = 0;
			 for (int i4:n4) {
				 if (i4==2) {
					 sum4 = sum4+i4; }
				 if (sum4==8) {
			 z4=true;}
				 }
			 System.out.println("Сумма "+sum4);
			 System.out.println(z4);
			 
// Задача 4-1		 
			 int [] n5 = {4,8,16,32,64,128}; 
			 for (int i5 = 0; i5<n5.length; i5+=2) {
				 System.out.print(n5[i5]);
				 System.out.print(" ");}
			 
			
}
}
