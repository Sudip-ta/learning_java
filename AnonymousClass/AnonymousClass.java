class ABC{
    public void show(){
        System.out.println("Hello");
    }
}

public class AnonymousClass {
    public static void main(String[] args) {
        new ABC().show(); //object created without storing it's reference in a reference variable, can't be accessed later, this is called an anonymous object
    }
}