package app;

public class Lesson_7_1 {
	public static void main(String[] args) {
		System.out.println("������ 2");
		Lesson_7_1 my2 = new Lesson_7_1();
		System.out.println(my2.diapazon(8));
		System.out.println("������ 3");
		System.out.println("������ ����� ����� ���������: " +firstLast(10671));
		System.out.println("������ 4");
		System.out.println("���������: " +fak(5));
		System.out.println("������ 5");
		System.out.println("� ���� ������ ����: " +day5(2,2020));
		System.out.println("������ 7");
		int [] n7 = {1,2,1,1,1};
		System.out.println("����� �������: " +every(n7,1));
		}
		
	
// ������ 1
		//�� ����� ������� ������ � ����������� ������������� ���. 
		//�������� ���: ���� �������� ������ ��� =60 ����� 0.
		// ���� 61-80 ����� 1. ���� 81 � ������ ����� 2
		// ���� ���� ��������� ��� ���� �������� �������� ����� ���� �� 5 ����.
		
		
// ������ 2
		// ���� ����� ����� n. ������� true, ���� n ��������� � ��������� �� 1 �� 10 ������������.
		// � ��������� ������ ���������� false.
	public boolean diapazon (int n2) {
		boolean z2 = false;
		if (n2<=10) {
			z2 = true;}
		return z2;
	}	
// ������ 3
	//������� ����� �����������, ��� � ����������� ����� ������ ����� ����� ���������.
	public static boolean firstLast (int n3) {
		boolean o3 = false;
		int first = n3;
		while (first>9) {
			first = first/10;}
		int last = n3%10;
		if (first == last) {
			o3 = true;}
		System.out.println(first);
		System.out.println(last);
		return o3;	}
// ������ 4
	//������� ����� ����������� ��������� ����� n.
	public static int fak (int n4) {
		int f4 = 1;
		for (int i=1; i<n4+1; i++) {
			f4 = f4*i;}
		return f4;}
// ������ 5
	//������� ����� ����������� ���������� ���� � ������ ������������� ���� (� ������ ����������� ����)
	public static int day5 (int m5, int y5) {
		int n5;
		double vysokos = y5%4;
		// y5%100
		// y5%400
		if (m5 == 2 && vysokos!=0) {	
			n5 = 28;}
		else if (vysokos==0 && y5!=300 && y5!=1300 && y5!=1900) {
			n5 = 29;}
		else if (m5 == 1 || m5 ==3 ||m5 ==5 ||m5 == 7 ||m5 == 8 ||m5 == 10 || m5 ==12) {
			n5 = 31;}
		else {n5 = 30;}
	return n5;
	}
// ������ 7
	//������� �����, ����� true, ���� �������� ����� ��������� "�������" � ������� �������.
	//��� ������� ��������: ��� ������������ ����� ���� ������������ ��������� �������, 
	//����� �� ��������� ����� ������� �����, �.� 
	
	public static boolean every (int [] n7, int i7) {
		boolean o7 = false;
		for (int i=0; i<=n7.length; i++) {
			if (i == i7 && i==i7+2) {
				o7 = true;
				break;
			}}
			return o7;}

}
