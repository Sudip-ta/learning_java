package ThisAndSuper;
class A{
    public A() {
        this(5);
        System.out.println("in A");
    }
    public A(int n){
        super();
        System.out.println("in A with int");
    }
}

class B extends A{
    public B() {
        super(); //Calls the default constructor of A(super class)
        System.out.println("in B");
    }
    public B(int n){
        this(); //calling this() which is a constructor of the same class, so it calls the default constructor of the same class
        System.out.println("in B with int");
    }
}

public class ThisAndSuper {
    public static void main(String[] args) {
        B b2 = new B(20);
    }
}
// Output
// in A with int
// in A
// in B
// in B with int