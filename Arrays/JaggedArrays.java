package Arrays;
public class JaggedArrays{
    public static void main(String [] args){
        int arr[][] = new int[3][];
        arr[0] = new int[3];
        arr[1] = new int[4];
        arr[2] = new int[2];

        for(int n[] : arr){
            for(int ele : n){
                System.out.print(ele + " ");
            }
            System.out.println();
        }
    }
}