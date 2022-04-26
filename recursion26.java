import java.util.Arrays;

public class recursion26 {
    public static void main(String[] args) {
        
        int[] arr = {6,3,7,2,1};

        selection(arr,arr.length,0,0);
        System.out.println(Arrays.toString(arr));
    }

    private static void selection(int[] arr, int i, int j,int max) {
        if(i==0){
            return;
        }
        if(j<i){
            if(arr[j]>arr[max]){
                selection(arr,i,j+1,j);
            }else{
                selection(arr, i, j+1, max);
            }
        }else{
            int temp = arr[max];
            arr[max]=arr[i-1];
            arr[i-1]=temp;
            selection(arr, i-1, 0, 0);
        }
    }
}
