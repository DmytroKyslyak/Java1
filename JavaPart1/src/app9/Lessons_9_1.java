package app9;

public class Lessons_9_1 {
	public static void main(String[] args) {		
//Задача 7
		String foo = "Дана строка-предложение на русском языке!";
		String bar = "";
		int p = foo.indexOf(' ');
		int p1 = foo.lastIndexOf(' '); 
		bar = foo.substring(p,p1);
		System.out.println(bar);
//Задача 8
		String foo1 = "Дана строка-предложение на русском языке.";
		foo1 = foo1.replace(".", "");	
		foo1 = foo1.replace(" ", ".");
		System.out.println(foo1);		
//Задача 9
		String foo2 = "Дана, строка qwertyyuuiopasdfg Предложение?,.98 на русссссссом,,,.. языке.";
		String maxbar = "";
			int max = 0;
		for (String bar1 : foo2.split(" ")) {
			String bar2 = "";
			int count = 0;
		for (char ch : bar1.toCharArray()) {
					if(ch >= 'А' && ch <='я') {bar2 += ((char) (ch));
					count++;
						if (count>max) {
							max = count;
							maxbar = bar2;	}
				}				
			}	
		}	
		System.out.println(maxbar+ " содержит " +max + " символов");
	}

}
