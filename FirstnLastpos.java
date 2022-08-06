import java.util.Arrays;
import java.util.Scanner;

public class FirstnLastpos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int[] arr = new int[n];
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int target = sc.nextInt();
        System.out.println(Arrays.toString(searchRange(arr,target)));
    }
        public static int[] searchRange(int[] nums, int target) {
            int [] arr =new int[2];
            int j=0;
            for(int i =0;i<nums.length;i++){
                if(nums[i]==target){
                    arr[0]=i;
                    j++;
                    break;
                }
            }
            for(int i =nums.length-1;i>=0;i--){
                if(nums[i]==target){
                    arr[1]=i;
                    j++;
                    break;
                }
            }

            if(j==0){
                arr[0]=-1;
                arr[1]=-1;
            }
            return arr;
        }

}
