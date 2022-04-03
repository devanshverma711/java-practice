import java.util.*;
public class SearchInsertPosition {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("ENter size of array");
            int size = sc.nextInt();
            int[] nums = new int[size];
            System.out.println("ENter array element");
            for(int i = 0;i<size;i++){
                nums[i]=sc.nextInt();
            }
            System.out.println("ENter target");
            int target = sc.nextInt();
            System.out.println(searchInsert(nums,target));
        }
    }
  public static int searchInsert(int[] nums, int target) {
        for(int i = 0; i < nums.length ; i++){
            if(nums[i]>=target){
                return i;
            }
        }
        return nums.length;
    }
}
