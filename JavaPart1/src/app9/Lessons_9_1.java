package app9;

public class Lessons_9_1 {
	public static void main(String[] args) {		
//������ 7
		String foo = "���� ������-����������� �� ������� �����!";
		String bar = "";
		int p = foo.indexOf(' ');
		int p1 = foo.lastIndexOf(' '); 
		bar = foo.substring(p,p1);
		System.out.println(bar);
//������ 8
		String foo1 = "���� ������-����������� �� ������� �����.";
		foo1 = foo1.replace(".", "");	
		foo1 = foo1.replace(" ", ".");
		System.out.println(foo1);		
//������ 9
		String foo2 = "����, ������ qwertyyuuiopasdfg �����������?,.98 �� �����������,,,.. �����.";
		String maxbar = "";
			int max = 0;
		for (String bar1 : foo2.split(" ")) {
			String bar2 = "";
			int count = 0;
		for (char ch : bar1.toCharArray()) {
					if(ch >= '�' && ch <='�') {bar2 += ((char) (ch));
					count++;
						if (count>max) {
							max = count;
							maxbar = bar2;	}
				}				
			}	
		}	
		System.out.println(maxbar+ " �������� " +max + " ��������");
	}

}
