
class Calculator{
    int a;
    int b;
    Calculator(int a, int b){  //Class Constructor
        this.a = a;
        this.b = b;
    }
    public void add(){
        System.out.println("Sum : "+(a+b));
    }
}

public class Classes{
    public static void main(String[]args){
        Calculator c = new Calculator(2,3); 
        c.add();
    }
}