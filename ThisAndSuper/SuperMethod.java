// package ThisAndSuper;
// class A{
//     public A() {
//         System.out.println("in A");
//     }
//     public A(int n){
//         System.out.println("in A with int");
//     }
// }

// class B extends A{
//     public B() {
//         System.out.println("in B");
//     }
//     public B(int n){
//         System.out.println("in B with int");
//     }
// }

// public class SuperMethod {
//     public static void main(String[] args) {
//         B b1 = new B();     //Output is : in A and in B
//         B b2 = new B(20);  //Output is : in A and in B with int
//     }
// }

// package ThisAndSuper;
// class A{
//     public A() {
//         super();  //Every constructor by default has a super method in the first line of it's code, it signifies the super class constructor
//         System.out.println("in A");
//     }
//     public A(int n){
//         super();
//         System.out.println("in A with int");
//     }
// }

// class B extends A{
//     public B() {
//         super();
//         System.out.println("in B");
//     }
//     public B(int n){
//         super();
//         System.out.println("in B with int");
//     }
// }

// public class SuperMethod {
//     public static void main(String[] args) {
//         B b1 = new B();
//         B b2 = new B(20);
//     }
// }


// package ThisAndSuper;
// class A{
//     public A() {
//         super();  //Every constructor by default has a super method in the first line of it's code
//         System.out.println("in A");
//     }
//     public A(int n){
//         super();
//         System.out.println("in A with int");
//     }
// }

// class B extends A{
//     public B() {
//         super();
//         System.out.println("in B");
//     }
//     public B(int n){
//         super(n); //passing super which a parameter so it calls the parameterised constructor of super class
//         System.out.println("in B with int");
//     }
// }

// public class SuperMethod {
//     public static void main(String[] args) {
//         B b1 = new B(); //in A in B
//         B b2 = new B(20);// in A with int in B with int
//     }
// }