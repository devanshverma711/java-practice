import java.util.Arrays;

public class duplicatesinarray {
    public static void main(String[] args) {
        int[] arr={1,5,2,6,2,67,7};
        System.out.println(duplicates(arr));
    }
    static boolean duplicates(int[] arr){
        Arrays.sort(arr);
        for(int i=1;i<arr.length;i++){
            if(arr[i]==arr[i-1]){
                return true;
            }
        }
        return false;
    }
}
