package app9;

public class Lessons_9 {
	public static void main(String[] args) {
		//���� ������-����������� �� ������� �����. 
		//����������� �, �������� ����������� ������ ������ ����� �� ��������� �� ��� � �������� 
		//� �������� ��� ���� ������� ���� (��� �������� � ���, �� � � ��, ���� � �», ��� � � �� � �. �.). 
		//����� ���������� � ������� �� ��������.
		
		//�������� ���������� ����� (�� 1 �� 3999) �������� ������� (I,V,X,L,C,D,M � 1,5,10,50,100,500,1000).

		String foo = "���� ������-����������� �� ������� �����!";
		String bar = "";
		for (char ch : foo.toCharArray()) {
			if(ch >= '�' && ch <='�') {bar += ((char) (ch +1));}
			else if(ch == '�') {bar += '�';}
			else {bar += ch;}	
		}
		System.out.println(foo);
		System.out.println(bar);
// ������ 2	
		String s = "";
		int n = 2583;
		
		int n1 = n/1000;
		int n2 = (n-(n1*1000))/500;
		int n3 = ((n-((n1*1000)+(n2*500)))/100);
		int n4 = ((n-((n1*1000)+(n2*500)+(n3*100)))/50);
		int n5 = ((n-((n1*1000)+(n2*500)+(n3*100)+(n4*50)))/10);		
		int n6 = ((n-((n1*1000)+(n2*500)+(n3*100)+(n4*50)+(n5*10)))/5);
		int n7 = ((n-((n1*1000)+(n2*500)+(n3*100)+(n4*50)+(n5*10)+(n6*5)))/1);
			while (n1>0) {s +="M"; n1--;}
			while (n2>0) {s +="D"; n2--;}
			while (n3>0) {s +="C"; n3--;}
			while (n4>0) {s +="L"; n4--;}
			while (n5>0) {s +="X"; n5--;}
				if (n6==1 && n7==4)  {s += "IX";} 
					else {while (n6>0)s += "V";}
				if (n7==4 && n6!=1) {s += "IV";}
				if (n7!=4 && n6!=1) {while (n7>0) {s +="I"; n7--;}}
		System.out.println(s);
		

	}
}
