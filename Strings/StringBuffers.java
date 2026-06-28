package Strings;

public class StringBuffers{
    public static void main(String[]args){
        StringBuffer sb = new StringBuffer();
        System.out.println(sb.capacity());
        StringBuffer sb1 = new StringBuffer("Sudipta");
        System.out.println(sb1.capacity());
        System.out.println(sb1.length());
        sb1.append(" Bhattacharya");
        System.out.println(sb1);
        sb1.insert(8,"Kumar ");
        System.out.println(sb1);
        String str = sb1.toString();
    }
}