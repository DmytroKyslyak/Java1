package app4;

public class Main {
	
		enum Day{San, Mon, Tue, Wed, Thu, Fri, Sat}
		public static void main(String[] args) {
			tell(Day.Mon);
			tell(Day.San);
			tell(Day.Fri);
			tell(Day.Wed);
	}
		public static void tell(Day day) {
			switch(day) {
			case Mon:
				System.out.println("�����������");
				break;
			case San:
			case Sat:
				System.out.println("��������");
				break;
			case Fri:
				System.out.println("����� �������� ���!");
				break;
			default:
				System.out.println("�������� ������");
				break;
			}
			
		}

}
