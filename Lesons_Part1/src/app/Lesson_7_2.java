package app;

import java.util.Arrays;

public class Lesson_7_2 {
	
	public static void main(String[] args) {
		System.out.println("������ 1");
			System.out.println(weather(40, 3));
			System.out.println(weather(5, 40));
		System.out.println("������ 2");
			System.out.println("� ����� ������ ����� ����� ���������: " + firstNum(34569));
		System.out.println("������ 4");		
			System.out.println("��������� � ������: " + podstrok("���"));
		System.out.println("������ 6");
			adventure(3,12,10,15,25,4,6);
			System.out.println("������ 7");	
			String s7 = "���";
			String s77 = "���8";
			System.out.println(twoStr(s7,s77));
		System.out.println("������ 9");
		int [] n9 = {1,1,1,1,5};
			System.out.println("������ ����������������: " + balans(n9));
		System.out.println("������ 10");
		//Lesson_7_2 my10 = new Lesson_7_2();
			int [] n10 = {1,9,1,3,5};
			System.out.println(Arrays.toString(n10));
			n10 = sort10(n10);
			System.out.println(Arrays.toString(n10));
		}
// ������ 1	
		//������� ����� ������ �� ������� �������� �������. 
		//� ����� ��������� ����������� (� �������� �������) � �������� �����. 
		//�� ������� ������� ������ ����: ��������, ��������� �����, ������, ����������� � �.�.
		public static String weather (int t, int w)	{
			String t1  = "�����";
			String w1  = "��������� �����";
			if (t >= 35) {
				t1 = "�����";}
			else if (t <= 10) {
				t1 = "�������";	}
			if (w>35) {
				w1 = "������� �����";}
			else if (w <= 5) {
				w1 = "�����������";}
			return (t1 +", " +w1);
			}
// ������ 2
		//������� ����� �����������, ��� � ����������� ����� ������ ����� ����� ���������

		public static boolean firstNum (int n2) {
			boolean o2;
			int last = n2%10;
			int first = n2;
			while (first > 9){first = first / 10;}
			o2 = (first == last?true:false);
			System.out.println(first);
			System.out.println(last);
			return o2;
		}
// ������ 4
		//������� �����, �������������� ���������� ��������� �������� � ������
		public static int podstrok(String s44) {
			String s4 = "�� �� ��� ��� �� ���, ���� ���";
			int kol4 = 0;
			String[] strings = s4.split(" "); // ����� ������ �� ��������� �����
		    for (String word : strings) {

		        if (word.matches(s44)) {  // ��������� � ����� ������ ��������� �����
		        	// ��� ���������� contains
		        	kol4++; }}
		   
			return kol4;
		}

// ������ 6
			//�������������� �������� ������ ���� ��������� ����������. 
			//������� �����, ��������� �� ����� ��� ���� � ������ �����������
			//(� ���� "���� �1 : 10��; ���� �2 : 7��; ���� �3 : 13��; "). 
			//����� ������ �������� ��� ������ ���������� ���� �����������.		
		public static void adventure (int...km) {
			int res = 1;
			for (int i10 = 0; i10<=km.length-1; i10++) {
			System.out.println("���� �" +res+": "  +km[i10]+ " ��");
			res++;}
		}
// ������ 7
		//������� ����� ������������ (���������������) ��� ������
		public static String twoStr (String s7, String s77) {
			String z7 = "�� �����";
			int i7 = s7.compareTo(s77); 
			if (i7 ==0) {
				z7 = "��������������� �����"; }
			return z7;
		}

// ������ 9
		//������� �����, �����������, ����� �� ������ ���� "����������������", 
		//�.�. ���������� �� ��� ����� � �����-�� �����, ����� �������, 
		//����� ����� ��������� ����� ����� ��������� ����� ��������� ������. 
		//{4,5,0,1,2,3,3};
		public static boolean balans (int [] n9) {
			boolean o9 = false;
			int sum1 = 0;
			int sum2 = 0;
			for (int i = 0; i<n9.length; i++) {
				sum1 = sum1+n9[i];
				sum2 = 0;
				for (int j = i+1; j<n9.length; j++) {
					sum2 = sum2+n9[j];}
					if (sum1 == sum2) {
						o9 = true;
						break;}}			
		return o9;}
 

		
// ������ 10
		//����������� ����� ������� ���������� ����������� ������� � ������� ������������ ������.
		public static int[] sort10(int[]n10) {
			//Arrays.sort(n10);
			//String nnn = Arrays.toString(n10);
			int temp;
			boolean o10 = true;
			int [] n11 = n10;
			for (int i = 0 ; i<n10.length-1; i++) {
				if (n11[i]>n11[i+1]) {
					temp = n11[i];
					n11[i] = n11[i+1];
					n11[i+1] = temp;
					o10 = false;}}
			if (o10 == true) {
				return n11;}
			else {
				return sort10(n11);
			}
			
		}
}