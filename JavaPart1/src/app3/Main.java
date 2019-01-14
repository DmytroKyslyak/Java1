package app3;

public class Main {
	public static void main(String[] args) {
		Animal a = new Dog();
		a.hello();
		
		Dog d = new Dog();		
		d.speak();
		
		Animal a1 = new Cat();
		a1.hello();
		
		Cat c = new Cat();		
		c.speak();
		
	}

}
