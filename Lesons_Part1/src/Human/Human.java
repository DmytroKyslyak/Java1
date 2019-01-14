package Human;

class Human {
    private int age;
    private String name;
    public Human(String name, int age){
        this.name = name;
        this.age = age;
    }    
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        //if (age < 0) throw new IllegalArgumentException();
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        //if (name.isEmpty()) throw new IllegalArgumentException();
        this.name = name;
    }
}


 
