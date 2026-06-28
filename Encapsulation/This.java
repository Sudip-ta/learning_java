package Encapsulation;
//Approach 1
// class Human{
//     private int age;
//     private String name;

//     public void setName(String name){
//         name = name;                    
//     }

//     public void setAge(int age){
//         age = age;              //Won't work cause local variable age of method setAge is assigning value to itself
//     }

//     public int getAge(){
//         return this.age;
//     }

//     public String getName(){
//         return this.name;
//     }
// }

// public class Encapsulation{
//     public static void main(String[] args) {
//         Human person = new Human();
//         person.setName("Sudipta Bhattacharya");
//         person.setAge(21);

//         System.out.println("Name: " + person.getName());
//         System.out.println("Age: " + person.getAge());
//     }
// }

//Approach 2
// class Human{
//     private int age;
//     private String name;

//     public void setName(String name){
//         name = name;
//     }

//     public void setAge(int age){
//         Human obj = new Human();  //Won't work cause it is creating another object besides the object we used to call this method and canging the value of instance variable age of that object.
//         obj.age = age;
//     }

//     public int getAge(){
//         return this.age;
//     }

//     public String getName(){
//         return this.name;
//     }
// }

// public class Encapsulation{
//     public static void main(String[] args) {
//         Human person = new Human();
//         person.setName("Sudipta Bhattacharya");
//         person.setAge(21);

//         System.out.println("Name: " + person.getName());
//         System.out.println("Age: " + person.getAge());
//     }
// }

//Approach 3
// class Human{
//     private int age;
//     private String name;

//     public void setName(String name){
//         this.name = name;
//     }

//     public void setAge(int age, Human person){
//         person.age = age;  //Will work cause we are passsing our object as an argument to the method 
//     }

//     public int getAge(){
//         return this.age;
//     }

//     public String getName(){
//         return this.name;
//     }
// }

// public class Encapsulation{
//     public static void main(String[] args) {
//         Human person = new Human();
//         person.setName("Sudipta Bhattacharya");
//         person.setAge(21,person);

//         System.out.println("Name: " + person.getName());
//         System.out.println("Age: " + person.getAge());
//     }
// }

//Approach 4(this)

class Human{
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

public class This{
    public static void main(String[] args) {
        Human person = new Human();
        person.setName("Sudipta Bhattacharya");
        person.setAge(21);

        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
    }
}