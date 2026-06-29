package ThisAndSuper;
class A{
    public A() {
        super();  //Every constructor by default has a super method in the first line of it's code
        System.out.println("in A");
    }
    public A(int n){
        super();
        System.out.println("in A with int");
    }
}

class B extends A{
    public B() {
        super();
        System.out.println("in B");
    }
    public B(int n){
        this(); //calling this() which is a constructor of the same class, so it calls the default constructor of the same class
        super(n); //passing super which a parameter so it calls the parameterised constructor of super class
        super();//Calls the default constructor of A(super class)
        System.out.println("in B with int");
    }
}

public class SuperMethod {
    public static void main(String[] args) {
        B b1 = new B(); //in A in B
        B b2 = new B(20);// in B in A with int in B with int in A
    }
}