import java.util.*;
public class consecutiveno{
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter size of array");
            int size = sc.nextInt();
            int[] nums=new int[size];
            for(int i =0;i<nums.length;i++){
                System.out.println("enter 1 or 0 ");
                nums[i]=sc.nextInt();
            }
            System.out.println(findMaxConsecutiveOnes(nums));
        }
    }
        public static int findMaxConsecutiveOnes(int[] nums) {
            int count  =0;
            int result =0;
            for(int i=0;i<nums.length;i++){
                if(nums[i]==0){
                    count=0;
                }
                else{
                    count++;
                    result=Math.max(result, count);
                }
            }
            return result; 
        }
}