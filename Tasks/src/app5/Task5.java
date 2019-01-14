package app5;

public class Task5 {
	//Создать класс Task5, в котором будут параметры int age, и String name. 
	//Создание обьекта происходит через контруктор с єтими двумя параметрами.
	//Также в классе должны быть get - ттеры и set - ттеры для данных полей
	int age;
	String name;
	
	Task5(int age, String name){
		this.age = age;
		this.name = name;
	}
	Task5(){}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public static void main(String[] args) {
		Task5 boy = new Task5(10, "Robin");
		Task5 boy1 = new Task5();
		boy1.setAge(15);
		boy1.setName("Bill");
		
		System.out.println(boy.age +" "+ boy.name);
		System.out.println(boy1.getAge() +" "+ boy1.getName());
	}
	

}
