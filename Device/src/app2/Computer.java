package app2;

//import java.util.Scanner;

public class Computer extends Device {
	public int Ram;
	// ������������� ������� ������
	//public static int min = 64;
	//public static int max = 1024;
	public static int ram;
	
	public int getRam() {
		return this.Ram;}
	
	public void setRam(int ram) {
	Ram = ram;
	}
	
/*
// �������� Ram ��������� � ���������
	public int getRam() {
		if (Ram <=64 || Ram >= 1000) {
			Ram = 0;
			return this.Ram;}
		return this.Ram;}
	

	*/
// ����� ������������� RAM �� �������.
	/*
	public void setRam(int ram) {
		Scanner in2 = new Scanner(System.in);
        System.out.println("������� " +Computer.min + " �������� " +Computer.max+" ������� Ram: ");
        ram = in2.nextInt();
        in2.close();
        if (ram >= min && ram <=max) {
        	Ram = ram;}
        else {
        	System.out.println("������. ������� ������� ");	}
	}
	*/
   // ����� �������� � ��
	public double perevodMb() {
		return (this.Ram)/1024/1024;
	}
	// ����� �������� � ��
	public double perevodGb() {
		return (this.Ram)/1024/1024/1024;
	}
	// ����� ����������� ������
	
	
}
