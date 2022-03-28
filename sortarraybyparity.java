import java.util.*;
public class sortarraybyparity {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            int size = sc.nextInt();
            int[] nums = new int[size];
            for(int i=0;i<nums.length;i++){
                nums[i]=sc.nextInt();
            }
            sortArrayByParity(nums);
        }
    }
    public static void sortArrayByParity(int[] nums) {
        int right = 0;
        int left = 0;
        for(int i =0;i<nums.length;i++){
            if(nums[i]%2!=0){
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
