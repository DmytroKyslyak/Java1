package app2;

public class Main {
	public static void main(String[] args) {
		/*
		Computer comp1 = new Server();
		Computer comp2 = new Computer();
		Computer comp3 = new Computer();
		Device comp4 = new Notebook();
		
		Server serv = new Server();
		Server serv1 = new Server();
		serv.setKolProc(20);
		serv1.setKolProc(4);
		System.out.println(Device.getCount());
		//System.out.println(serv1.getCount());
		
		//������� � �� � ��
		Computer comp6 = new Computer();
		comp6.setRam(2000000000);
		System.out.println("��������� � �� " +comp6.perevodMb());
		System.out.println("��������� � �� " +comp6.perevodGb());
		
		//Device dev = new Device();
		//dev = dev.createDevice(2,110);
		//dev = dev.createDevice(3,220);
		comp1.setRam(550);
		comp2.setRam(30);		
		comp3.setPower(5);
		comp4.setPower(3);
		
		//�������� ��������� �������� ���� ������� � �������� ����������  � ��� �� �����.
		
		//������������� ����������� �������� ��������� ��� �������� �������� � ����������� ��������� �������� 
		//��� ��������� ����������� �������. �������� ������� ��� �������� �������� � ��������� ����� �������� ��������.
		
		//�������� �����, ��������������� �������� ����������. ����� ������ ���������� ���� ����������. 
		//�������������� ���� ����� ��� �����������. 
		//�������� ����� �� �����, ��������������� ����� ������ ��� �����������. 
		//����������� ��� ������ �� ��������.
		
		System.out.println("������ ������� " +comp1.getRam());
		System.out.println("������ ���������� " +comp2.getRam());
		System.out.println("�������� ���������� " +comp3.getPower());
		System.out.println("�������� �������� " +comp4.getPower());
		
		//����� ������ ���������� �����������
		Device obj = new Device();
		Device dev = obj.createDevice(3,220);
		System.out.println(dev.getPower());
		System.out.println(dev.getClass() +" "+ dev.getName() +" "+dev.getPower() );
		
		//�������� ����� ���������� ���������� ��������������� ��� ������� ����������
		//(��������������� �������� ��������� ���� ���������). ��� ������� ������� ��������� 
		//��������� ������ ���������� �� ���������� �����. ���������� ������������� ��������������� ������ 
		//���������� ���������� ��������������.

		//���������� ���������� ����������� ������������ ������ ���������� �����������

		//�������� ����������� �� ����� ������ ��� �����������. 
		//������ ������ ���� �� ����� ������������ �������� � �� ����� ������������� ��������. 
		//��� ������� ������� ���������(��� �������� ������������) � ������������ ������� � �������� �������������� 
		//� �� ������� ������ � ����� ������. ����������� ������ ���� �������� ��������� ������ ���������� �� ��� ��������
		*/
		/*
		Computer comp7 = new Server();
		comp7.setRam(Computer.ram);
		System.out.println("������ ������� " +comp7.getRam()+" ID: "+comp7.createId());
		
		Device comp9 = new Tv();
		System.out.println(comp9 +" ID: "+comp9.createId());
		Device comp10 = new Tv();
		System.out.println(comp10 +" ID: "+comp10.createId());
		Device comp11 = new Tv();
		System.out.println(comp11 +" ID: "+comp11.createId());
		Device comp12 = new Tv();
		System.out.println(comp11 +" ID: "+comp12.createId());
		*/
		/*
		 // ����� Power
		int n = 5;
		Device dev[] = new Device[n];
		Device devobj = new Device();
		dev[0] = devobj.createDevice(1,5);
		dev[1] = devobj.createDevice(2,6);
		dev[2] = devobj.createDevice(1,7);
		dev[3] = devobj.createDevice(2,8);
		dev[4] = devobj.createDevice(3,9);
		System.out.println("�������� ��������: "+devobj.sumPow(dev)); //�������� �������� ��������� �������
		*/
		//����� RAM
		/*
		int n = 3;
		Device devobj = new Device();
		Device dev[] = new Device[n];
		dev[0] = devobj.createDevice(3,5);// ����� ��������������
		((Computer)dev[0]).setRam(10);
		dev[1] = devobj.createDevice(2,6);
		dev[2] = devobj.createDevice(1,7);
		((Computer)dev[2]).setRam(20);	// ����� ��������������
		System.out.println(devobj.getCounter(dev));
		*/
		//��������� ���� ���������
		// 1-� ����������
		/*
		Device devobj = new Device();
		Device dev = new Device();
		dev = devobj.createDevice(1,5);
		((Computer)dev).setRam(564);
		// 2-� ����������
		Device dev1 = new Device();
		dev1 = devobj.createDevice(3,15);
		((Computer)dev1).setRam(256);
		System.out.println("��������� ���������: " +devobj.compDevs(dev, dev1));
		*/
		Device devobj = new Device();
		Device dev = new Device();
		dev = devobj.createDevice(1,5);
		// 2-� ����������
		Device dev1 = new Device();
		dev1 = devobj.createDevice(4,15);
		System.out.println("��������� ���������: " +devobj.compDevs(dev, dev1));
		/*
		Device devobj = new Device();
		Device dev = new Tv();
		dev = devobj.createDevice(4,5);
		((Tv)dev).setDiagonal(60);
		// 2-� ����������
		Device dev1 = new Tv();
		dev1 = devobj.createDevice(4,15);
		((Tv)dev1).setDiagonal(32);
		System.out.println("��������� ���������: " +devobj.compDevs(dev, dev1));
		*/
	}
}
