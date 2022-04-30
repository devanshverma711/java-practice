import java.util.Arrays;

public class mergesort2 {
    public static void main(String[] args) {
        int[] nums={5,2,4,7,1};
        sort(nums,0,nums.length-1);
        System.out.println(Arrays.toString(nums));
    }

    private static void sort(int[] nums, int low, int hi) {
        
        if(low>=hi){
            return;
        }
        int s = low;
        int e = hi;
        int mid=s+(e-s)/2;
        int pivot=nums[mid];
        while(s<=e){
            while(nums[s]<pivot){
                s++;
            }
            while(nums[e]>pivot){
                e--;
            }

            if(s<=e){
                int temp = nums[s];
                nums[s] = nums[e];
                nums[e] = temp;
                s++;
                e--;
            }
        }
        sort(nums,low,e);
        sort(nums,s,hi);
    }
    
}
