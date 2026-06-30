class A{
    public void display(){
        System.out.println("Class A");
    }
}

class B extends A{
    public void display(){
        System.out.println("Class B");
    }
    public void onlyForB(){
        System.out.println("This method is only in Class B");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        A obj1 = new A();
        obj1.display(); // Output: Class A

        B obj2 = new B();
        obj2.display(); // Output: Class B

        A obj3 = new B();
        obj3.display();// Output: Class B (Method overriding)
        obj3.onlyForB();//Won't work because obj3 is of type A, and onlyForB() is not defined in class A
    }
}