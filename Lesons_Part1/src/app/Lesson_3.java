package app;

public class Lesson_3 {
	public static void main(String[] args) {
		int x,y;
		x = 10;
		y = 20;
		int count = x+y;
		if (count>0) {
			System.out.println("����� �������������");
		}
		else {
			System.out.println("����� �������������");
		}
		if (count>0)
			System.out.println("count = " +count);
		if (count>0) {
			System.out.println("count = " +count);
		}
			System.out.println((count>0)?"����� �������������":"����� �������������");
		int val = (count>0)?1:-1;
			System.out.println(val);
// ������� 1
		int a = 50;
		int va = (a>0?a+1:a);
			System.out.println(va);
// ������� 2
		int b = 10;
		if (b==0) {
			b=10;
			System.out.println(b);}
		else {int v = (b>0?b+1:b-2);
		System.out.println(v);}
// �������� 3
		int c, co;
		a = 10;
		b = -5;
		c = 15;
		co = 0;
		if (a>0) {
			co++;}
		if (b>0) {
			co++;}
		if (c>0) {
			co++;}
		System.out.println("������������� " +co);
// ������ 4
		int n = 3-co;
		System.out.println("������������� " +n);
// ������ 5
		if (a<b && a<c) {
			System.out.println("����� ��������� ����� " +a);
		}
		if (b<a && b<c) {
			System.out.println("����� ��������� ����� " +b);
		}
		if (c<a && c<b) {
			System.out.println("����� ��������� ����� " +c);
		}
// ������ 6
		int god = 300;
		double vysokos = god%4;
		double vysokos1 = god%400;
		double vysokos2 = god%100;
		String nameGod = (vysokos2==0 & vysokos1 !=0?" �� ����������":(vysokos==0?" ����������":" �� ����������"));{
			System.out.println(god + nameGod);}
		
// ������ 7
		int q = 111;
		double k = q%2;
		String val1 = k!=0?"�� ������":"������";
		String val2 = (q>9 && q<100?"����������":(99<q && q<999?"�����������":"�����������"));
				System.out.println("����� " +q +" "+val1 + " " +val2);
// ������ 8
		int dayNum = 5;
		String day;
		switch (dayNum) {
		case 0:
			day = "Monday";
			break;
		case 1:
			day = "Tuesday";
			break;
		case 2:
			day = "Wednesday";
			break;
		case 3:
			day = "Thursday";
			break;
		case 4:
			day = "Friday";
			break;
		case 5:
			day = "Saturday";
			break;
		case 6:
			day = "Sanday";
			break;
		default:
			day = "������ ����� �� 0 �� 6";
			break;
		}
				System.out.println("today is " +day);		
// ������ 9
				int Num = 5;
				String ka;
				switch (Num) {
				case 1:
					ka = "�����";
					break;
				case 2:
					ka = "�� �����������������";
					break;
				case 3:
					ka = "�����������������";
					break;
				case 4:
					ka = "������";
					break;
				case 5:
					ka = "�������";
					break;
				default:
					ka = "������ ����� �� 1 �� 5";
					break;
				}
						System.out.println("���� ������ - " +ka);				
//������ 10
						double dlina = 5600;
						int edNum = 4;
						//double z = (edNum==1?dlina/10:(edNum==2?dlina*1000:(edNum==3?dlina:(edNum==4?dlina/1000:dlina*10))));
						double ed;
						switch (edNum) {
						case 1:
							ed = dlina/10;
							System.out.println("����� ������� - " +dlina+ " ���������� " +ed+ " ������");	
							break;
						case 2:
							ed = dlina*1000;
							System.out.println("����� ������� - " +dlina+ " ���������� " +ed+ " ������");
							break;
						case 3:
							ed = dlina;
							System.out.println("����� ������� - " +dlina+ " ������ " +ed+ " ������");
							break;
						case 4:
							ed = dlina/1000;
							System.out.println("����� ������� - " +dlina+ " ����������� " +ed+ " ������");
							break;
						case 5:
							ed = dlina*10;
							System.out.println("����� ������� - " +dlina+ " ����������� " +ed+ " ������");
							break;
						default:
							
							System.out.println("������ ����� �� 1 �� 5");
							break;
						}
						//System.out.println("����� ������� - " +dlina+ " " +ed);	
						//System.out.println("����� ������� - " +z+ " ������");
}
}

