package Arrays;
public class TwoDArrays{
    public static void main(String[]args){
        // int arr1[][] = {{1,2,3},{4,5,6}};
        int nums[][] = new int [3][3];

        for(int i = 0;i<nums.length;i++){
            for(int j = 0;j<nums[i].length;j++){
                nums[i][j] = (int)(Math.random()*10);
            }
        }

        for(int i = 0;i<nums.length;i++){
            for(int j = 0;j<nums[i].length;j++){
                System.out.print(nums[i][j]+" ");
            }
            System.out.println();
        }

        //Enhanced for loop used
        for(int n[] : nums){
            for(int element : n){
                System.out.print(element+" ");
            }
            System.out.println();
        }
    }
}