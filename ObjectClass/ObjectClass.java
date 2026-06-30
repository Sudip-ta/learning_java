package ObjectClass;

class Laptop{
    String brand;
    int price;

    public String toString() {
        return "Laptop [brand=" + brand + ", price=" + price + "]";
    }

    public int hashCode() {
        return brand.hashCode() + price;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Laptop other = (Laptop) obj;
        return brand.equals(other.brand) && price == other.price;
    }
}

public class ObjectClass {
    public static void main(String[] args) {
        // Create an object of the Object class
        Object obj = new Object();

        // Call the toString() method
        System.out.println("toString(): " + obj.toString());

        // Call the hashCode() method
        System.out.println("hashCode(): " + obj.hashCode());

        // Call the equals() method
        Object anotherObj = new Object();
        System.out.println("equals(): " + obj.equals(anotherObj));
    }
}