class Calculator{
    public int add(int a,int b){
        return (a+b);
    }
    public int add(int a, int b, int c){
        return (a+b+c);
    }
    public double add(int a, double b){
        return a+b;
    }
}

public class Main{
    public static void main(String[]args){
        Calculator calc = new Calculator();
        int r1 = calc.add(1,2);
        System.out.println(r1);
        int r2 = calc.add(1,2,3);
        System.out.println(r2);
        double r3 = calc.add(1,2.0);
        System.out.println(r3);

    }
}