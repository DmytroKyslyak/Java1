package app6;

public class Lesson_6 {
	public static void main(String[] args) {
	
		//������ 1
	String s = "�������� ���������� �������";
	String ss = s.replace(' ', '_');
	System.out.println(ss);
	//������ 2
	System.out.println(s.length());
	String parts[] = s.split(" ");
	System.out.println(parts.length);
	
	//������ 3
	String s1[] = s.split(" ");;
	int maxlen = 0;
	int maxlnd = 0;
	String s2 = "";
	for(int i = 0; i<s1.length; i++) {
		if(s1[i].length()>maxlen) {
			maxlen=s1[i].length();
			maxlnd = i;		}
			}
	s2=s1[maxlnd];
	System.out.println(s2);
	
	for(int i = 0; i<s1.length; i++) {
		if(i == maxlnd)
			continue;
		s2 =s2 + " " +s1[i];}
	System.out.println(s2);
	}	
}
