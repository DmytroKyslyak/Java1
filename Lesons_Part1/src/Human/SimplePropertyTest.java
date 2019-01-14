package Human;

public class SimplePropertyTest {

    public static void main(String[] args){
        Human man = new Human("Ivan", 21);
        man.setName("Sviatopolk");
        int b = 44;
        man.setAge(b);
        int a = man.getAge();
        //man.age  //Попытка обратиться к полю напрямую вызовет ошибку 
        System.out.println(man.getName() + " " + man.getAge());
        System.out.println(a);
    }
}
