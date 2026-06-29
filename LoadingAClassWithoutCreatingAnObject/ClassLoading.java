package LoadingAClassWithoutCreatingAnObject;

class Abc{
    static{
        System.out.println("Static block is invoked");//static block is only invoked once when the class is loaded into memory
    }
    public void print(){
        System.out.println("Hello");
    }
}

public class ClassLoading {
    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("LoadingAClassWithoutCreatingAnObject.Abc");//class is loaded into memory but object is not created
        Abc a = new Abc(); //Class is loaded only once into memory but object is created multiple times
        Abc b = new Abc();
        a.print();
        b.print();
    }
}