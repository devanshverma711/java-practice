import java.util.*;
public class evendigitsinarray {
    public static void main(String[] args){
            Scanner sc =new Scanner(System.in);
            System.out.println("Enter size of array");
            int size = sc.nextInt();
            int nums[]=new int[size];
            for(int i=0;i<size;i++){
                System.out.println("Enter elements");
                nums[i]=sc.nextInt();
            }    
        System.out.println(findNumbers(nums));
    }   
    public static int findNumbers(int[] nums) {
        int cout = 0;
        for(int i =0;i<nums.length;i++){
            int count = 0;
            while(nums[i]!=0){
               nums[i]=nums[i]/10;
               count ++;
               //nums[i]=j;
          }
         if(count%2==0){
             cout ++;
          }
        }
         return cout;
}
} 

