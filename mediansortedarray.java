import java.util.Arrays;

public class mediansortedarray {
    public static void main(String[] args) {
        int[] nums1={1,3};
        int [] nums2={2};
        System.out.println(findMedianSortedArrays(nums1,  nums2));
    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int a1 = nums1.length;
        int a2 = nums2.length;
        int c = a1 + a2;
        int[] arr = new int[c];

        if(a1!=0){
            for(int i =0;i<a1;i++){
                arr[i]=nums1[i];
            }
        }
        System.out.println(Arrays.toString(arr));

        for(int j =0;j<a2;j++){
            if(a1!=0){
                arr[a1+j]=nums2[j];
            }
            else{
                arr[j]=nums2[j];
            }
        }System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        double z=0;
        if(c%2!=0){
            z=arr[c/2];
            // return z;
        }
        else{
            int k=arr[(c/2)-1]+arr[c/2];
            z=(double)k/2;
            //return z;
        }
        return z;
    }
}
