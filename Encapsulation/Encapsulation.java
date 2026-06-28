package Encapsulation;

class Person{
    private int age;
    private String name;

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return this.age;
    }

    public String getName(){
        return this.name;
    }
}

public class Encapsulation{
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Sudipta Bhattacharya");
        person.setAge(21);

        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
    }
}