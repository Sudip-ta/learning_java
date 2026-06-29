package Constructors;

class Human{
    String name;
    int age;

    Human(){
        name = "Unknown";
        age = 0;
    }

    Human(String name, int age){  //Parameterized Constructor
        this.name = name;
        this.age = age;
    }

    void display(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class Constructors {
    public static void main(String[] args) {
        Human human1 = new Human();  // Calls the default constructor
        human1.display();

        System.out.println();

        Human human2 = new Human("Alice", 25);  // Calls the parameterized constructor
        human2.display();
    }
}