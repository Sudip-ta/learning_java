package StaticKeyword;

class Mobile{
    static String brand;
    int price;

    static{
        brand = "Samsung";  //Static block to initialize static variable, only once when the class is loaded
        System.out.println("Inside static block");
    }

    public Mobile(int price){
        this.price = price;
    }

    static void displayBrand(){
        System.out.println("Brand: " + brand);
    }

    public void displayAll(){
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
    }
}

public class StaticVariablesAndMethods {
    public static void main(String[] args) {
        Mobile.displayBrand();
        Mobile mobile2 = new Mobile(10000);
        mobile2.displayAll(); // Calling non-static method using an object
        Mobile mobile1 = new Mobile(20000);
        mobile1.displayAll(); // Calling non-static method using an object

        Mobile.brand = "Apple"; // Modifying static variable using class name

        //print after changing the static variable
        System.out.println("After changing the static variable:");
        mobile1.displayAll();
        mobile2.displayAll();
    }
}