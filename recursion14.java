public class recursion14 {
    public static void main(String[] args) {
        int[] arr = {2,4,6,9,23,46,68,98};
        int start = 0;
        int end = arr.length-1;
        int target = 23;
        System.out.println( binary(arr,target,start,end));
    }

    static int binary(int[] arr , int target , int start , int end){
        if(start>end){
            return -1;
        }
        int mid = start+(end-start)/2;
        if(arr[mid]==target){
            return mid;
        }
        if(target>arr[mid]){
            return binary(arr,target,mid+1,end);
        }
           return  binary(arr,target,start,mid-1);
    }
    
}
