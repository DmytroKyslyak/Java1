package app5;

public class Task2 {

	//������� ����� Task2, � ������� ����� ���� ������� isOdd, 
	//�������� ��������� �������� �����(int) � ���������� ����� true ���� ����� ������, � false ���� �� ������
	public static void main(String[] args) {
		Task2 ch = new Task2();
				
		System.out.println(ch.isOdd(6));
		
		
	}
	public boolean isOdd(int a) {
		boolean b;
		if (a%2 == 0) {
			b = true;} 
		else {b = false;}
		
		
		return b;
	}
	
}
