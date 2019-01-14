package app9;

public class Lesons_9_2 {
	public static void main(String[] args) {
		String s = "Петров Петр Ветрович";
		String bar4 [] = s.split(" ");
			for (int i=1; i<bar4.length; i++) {
					bar4[i] = bar4[i].substring(0,1)+".";}
		System.out.println(bar4[1]+bar4[2]+bar4[0]);
		}
}
