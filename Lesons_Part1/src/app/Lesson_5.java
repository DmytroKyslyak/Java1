package app;
import java.util.Random;


public class Lesson_5 {

	public static void main(String[] args) {
// ������ 1
		/*
		 * int n = 6; 
		 * int [] a = new int [n]; 
		 * for (int i = 0; i<n; i++) { a[i] = 2*i+1;
		 * System.out.println(a[i]); }
		 */
// ������ 2
		/*
		 * int [] n1 = {1,3,5,6,7,8}; for (int i=n1.length-1; i>=0; i--) {
		 * System.out.println(n1[i]); }
		 */
// ������ 3
		/*
		 * int count = 0; int count1 = 0; int [] n2 = {1,3,5,6,7,8,4,4,9}; for (int i =
		 * 0; i<n2.length-1; i++) {
		 * 
		 * if (n2[i]%2==0) { count++; System.out.print(n2[i]+" ");}
		 * 
		 * } System.out.println(""); System.out.println("���������� ����� " +count); for
		 * (int i = n2.length-1; i>=0; i--) {
		 * 
		 * if (n2[i]%2!=0) { count1++; System.out.print(n2[i]+" ");} }
		 * System.out.println(""); System.out.println("���������� ����� " +count1);
		 */
//������ 4 
		/*System.out.println("������ 4");
 		int [] a1 = {1,3,5,6,7,8}; 
  		for (int i = 0; i<a1.length; i+=2) {
		System.out.println(a1[i]); }
		 
// ������ 5
		System.out.println("������ 5");
		int[] a2 = { 1, -1, 2, -2, 6, -7, -8, 9, };
		for (int i = 0; i < a2.length; i++) {
			if ((a2[i] > 0) && (a2[i + 1] > 0) || (a2[i] < 0) && (a2[i + 1] < 0)) {
				System.out.println(i + 1);
				return;
			}
		}
		System.out.println(0);*/
// ������ 6
		//��� ������������� ������ ������� N. 
		//����� ���������� ��������� ��������� � ������ �������.		
		System.out.println("������ 6");
		 int [] a3 = {1,4,7,3}; 
		 int count6 = 0;
		 metka: for (int i = 0; i<a3.length; i++) { 
			 	for (int j = i+1; j<a3.length; j++) {
				 	if (a3[i]==a3[j]) 
			  break metka;}
			 count6 = count6+1; }
		 System.out.println("���������� ����� " +count6);
// ������ 7		
		 /*���� ��� ������� A � B ����������� ������� N. 
		 ������������ ����� ������ C ���� �� �������, 
		 ������ ������� �������� ����� ������������� 
		 �� ��������� �������� A � B � ��� �� ��������.*/
			System.out.println("������ 7");
		int n7 = 4;
		int [] a7 = {1,9,7,3};	
		int [] b7 = {3,5,7,1};
		int [] c7 = new int [n7];
			for (int i = 0; i<n7; i++) { 
				c7[i]=(a7[i]>b7[i]?a7[i]:(a7[i]<b7[i]?b7[i]:a7[i]));
				System.out.print(c7[i] +" ");
			}
			System.out.println("");
// ������ 8	
			System.out.println("������ 8");
			//���� ��� ������� A � B, �������� ������� ����������� �� �����������. 
			//���������� ��� ������� ���, 
			//����� �������������� ������ C ������� ������������� �� �����������.
			int x8;
			int [] a8 = {11,18,15};	
			int [] b8 = {1,14,15,16,1,17,19,1};
			int [] c8 = new int [a8.length+b8.length];
			System.arraycopy(a8, 0, c8, 0, a8.length);
			System.arraycopy(b8, 0, c8, a8.length, b8.length);
			// ���������� ��������� ������
			for (int k: c8)
			System.out.print(k +" ");
			System.out.println("");	
			// ��������� �� �����������
			for (int j=0; j<c8.length-1; j++) {
				for (int i=0; i<c8.length-1; i++) {
						 x8 = c8[i];
						 	if (c8[i]>c8[i+1]) {
						 		c8[i] = c8[i+1];
						 		c8[i+1] = x8;					
				}
				}
				}
					for (int k: c8)
					System.out.print(k +" ");
			
System.out.println("");	
// ������ 9	
		System.out.println("������ 9");	
		//��� ������ ������� N. �������� ������� ��� ��������� �� ��������.
		int [] n9 = {1,14,15,16,17,19};
		for (int i=n9.length-1; i>=0; i--) {
			System.out.print(n9[i] +" ");
		}
System.out.println("");
// ������ 10	
		System.out.println("������ 10");
		//��� ������ ������� N. 
		//�������� �������� �������, ������������� ����� ��� ����������� � ������������ ���������� 
		//(�� ������� ����������� � ������������ ��������).
		int [] n10 = {15,1,12,16,19,17,20};
		int max, min, imax, imin;
		max = n10[0];
		min = n10[0];
		imax = 0;
		imin = 0;
		for (int i=1; i<=n10.length-1; i++) {
			if (n10[i]>max) {
				max = n10[i];
				imax = i;}	
			if (n10[i]<min) {
				min = n10[i];
				imin = i;
			}
				}
		System.out.println(max+ " ������� "+ imax);
		System.out.println(min+ " ������� "+ imin);
		for (int i=imin+1; i<=imax-1; i++) {
			n10[i]=0; //�������� ��������
		}
		for (int k10: n10)
			System.out.print(k10 +" "); //������� � 0
	System.out.println("");
// ������ 11	
		System.out.println("������ 11");
		//���� ������ �� N ����� �����, ���������� �� ������� ���� ��� ����. 
		//������� ����� ����� �� ������� �������, ������������� ����� ���������� ����� ������ 
		//(���� ��������� ���� ���� ������, �� ������� 0).
		int [] n11 = {15,0,12,5,9,19,20,9,0};
		int f11 = 0; 
		int l11 = 0;
		int sum11 = 0;
			for (int i=0; i<=n11.length-1; i++) {
				if (n11[i] == 0) {
					l11 = i;}	}
			System.out.println(l11);
			
			for (int i=0; i<=l11-1; i++) {
				if (n11[i] == 0) {
					f11 = i;}	}
			System.out.println(f11);
			for (int i=f11; i<=l11; i++) {
				sum11 = sum11+n11[i];
			}
			System.out.println(sum11);
// ������ 12	
		System.out.println("������ 12");
		/*�������� ������ �� ���������� ����� ���������, ����������� ���������� �������. 
		��� "����������" ���������� ��� �����, ����������� ����� ����� ����������� �������(������������). 
		������������ ����� ����� �������� 1. ������� ���������� �������� � �������.
		[6] = 1
		[4][0][9][1][7][8][9][0]  = 7
		[8][8][7][2][0][2][1][9]  = 3
		[0][7][3][5][1][7][0]  = 7
		*/
// ������ 13	
		System.out.println("������ 13");		 
		
		//������� ��������� ������ NxM. 
		//��������� ��� ���������� ������ ������� �� -100 �� 100. 
		//������� ������ �� �����. ������� �� ����� �������� ������������� �������� ����� �������
		int n13 = 2;
		int m13 = 5;
		int [][] a13 = new int [n13][m13];
		Random random = new Random();
		int max13 = 0;
		for (int i = 0; i < a13.length; i++) {
			for (int j = 0; j < a13[i].length; j++) {
				a13[i][j] = random.nextInt(100);
				if (a13[i][j] > max13) {
					max13 = a13[i][j];					
					}
				System.out.print(a13[i][j] + " ");
			}
			System.out.println("");
		}
		System.out.println("���������� ����� ������� "+max13);
// ������ 14	
		System.out.println("������ 14");	
		//�������� ��������� ������ NxM. 
		//��������� ��� ���������� ������ ������� �� 0 �� 9. 
		//�������� ������ �� �����. ������������ ������ ������ �������, �� �����������. 
		//�������� ��������������� ������ �� �����.
		int n14 = 2;
		int m14 = 5;
		int x14;
		int [][] a14 = new int [n14][m14];
		Random random14 = new Random();
		for (int i = 0; i < a14.length; i++) {
			for (int j = 0; j < a14[i].length; j++) {
				a14[i][j] = random14.nextInt(9);
					System.out.print(a14[i][j] + " ");	}
			System.out.println("");	}
		
		for (int i14 = 0; i14 < a14.length; i14++) {	
			for (int j142 = 0; j142 < a14[i14].length; j142++) {	
			for (int j14 = 0; j14 < a14[i14].length-1; j14++) {				
				x14 = a14[i14][j14];			
			if (a14[i14][j14]>a14[i14][j14+1]) {
			 		a14[i14][j14] = a14[i14][j14+1];
			 		a14[i14][j14+1] = x14;}	}			
			}}	
		for (int i141 = 0; i141 < a14.length; i141++) {			
			for (int j141 = 0; j141 < a14[i141].length; j141++) {
				System.out.print(a14[i141][j141] + " ");	}
				System.out.println("");	}
// ������ 15	
		System.out.println("������ 15");				
		//������� ����� ������� ������� ������ �� ������� ���������. 
		//� ������ 15 �������, ������� ����� ��� �� ������ �����������. 
		//�������� ���������, ������� ����� �������� �� ����� 15 ��������� �������� �� ������� ��������� (�� 2*2 �� 9*9). 
		//��� ���� ����� 15 �������� �� ������ ���� ������������� 
		//(������� 2*3 � 3*2 � �� �������� ���� ������� ��������������).
		int n15 = 15;
		int m15 = 2;
		int [][] a15 = new int [n15][m15];
		Random random15 = new Random();
		for (int i = 0; i < a15.length; i++) {
			for (int j = 0; j < a15[i].length; j++) {
				a15[i][j] = random15.nextInt(8)+2;
				}}

		for (int i = 1; i < 16; i++) {	
			if (a15[i][0]*a15[i][1] == a15[i+1][0]*a15[i+1][1])
			continue;
				System.out.print(i+" "+a15[i][0] + " * " +a15[i][1] +" =");	
			System.out.println("");	}
		
// ������ 16	
		System.out.println("������ 16");
		//���� ����� ����� N. �������� ������ NxN � ��������� ��� �� ������� ������� � �������[0;0]. 
		//�����������: ������, ����, ����� � �����

	}		 
	}