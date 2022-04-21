public class recursion22 {
    public static void main(String[] args) {
        int[] arr = {1,4,7,8,9,22,45,76};
        sorted(arr,0);
        System.out.println(sorteed(arr, 0));
    }
    
    static void sorted(int[] arr,int i){
        if(i==arr.length-1){
            System.out.println("OK");
            return;
        }
        if(arr[i]>arr[i+1]){
            System.out.println(i );
            return;
        }
        sorted(arr,i+1);
    }

    static boolean sorteed(int[] arr,int i){
        if(i==arr.length-1){
            return true;
        }
        return arr[i]<arr[i+1] && sorteed(arr,i+1);
    }
}
