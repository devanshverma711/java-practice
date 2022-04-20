import java.util.*;
public class MoveZeroes {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            int size = sc.nextInt();
            int[] nums = new int[size];
            for(int i=0;i<nums.length;i++){
                nums[i]=sc.nextInt();
            }
            movezero(nums);
        }
    }
    static void movezero(int[] nums){
        int right=0;
        int left =0;
        for(int i =0;i<nums.length;i++){
            if(nums[i]==0){
                right++;
            }
            else{
                right=nums[i];
                nums[i]=nums[left];
                nums[left]=right;
                right++;
                left++;
            }
        }
        for(int j =0;j<nums.length;j++){
            System.out.print(nums[j]);
        }
    }
}
