package Arrays;
import java.util.Scanner;
class Student{
    String name;
    int roll;
    double marks;
}

public class ArrayOfObject{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        Student students[] = new Student[3];
        int nums[] = new int[3];
        for(int n : nums){
            n = sc.nextInt();
        }
        // for(int i = 0; i<students.length; i++){
        //     students[i] = new Student();
        //     students[i].name = "Sudipta";
        //     students[i].roll = 10;
        //     students[i].marks = 80.0;
        // }
        // for(Student s : students){
        //     System.out.println(s.name+ " "+s.roll+" "+s.marks);
        // }
        for(int n : nums){
            System.out.println(n);
        }
    
    }


}
