package Inheritance;
class VeryAdvancedCalculator extends AdvancedCalculator {
    public double power(int a, int b) {
        return Math.pow(a, b);
    }
}

public class MultiLevelInheritance {
    public static void main(String[] args) {
        VeryAdvancedCalculator veryAdvCalc = new VeryAdvancedCalculator();

        int sum = veryAdvCalc.add(10, 5);
        int difference = veryAdvCalc.subtract(10, 5);
        int product = veryAdvCalc.multiply(10, 5);
        int quotient = veryAdvCalc.divide(10, 5);
        double powerResult = veryAdvCalc.power(2, 3);

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        System.out.println("Power: " + powerResult);
    }
}
