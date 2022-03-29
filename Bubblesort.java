import java.util.*;
public class Bubblesort {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            int size = sc.nextInt(); 
            int[] arr = new int[size];
            for(int i =0;i<arr.length;i++){
                arr[i]=sc.nextInt();
            }
            for(int i =0;i<arr.length;i++){
                System.out.print(" "+arr[i]);
            }
            bubble(arr);
        }
    }    
    static void bubble(int[] arr){
        for(int i =0;i<arr.length-1;i++){
            for(int j =0;j<arr.length-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("Sorted array is ");
        for(int i =0;i<arr.length;i++){
        System.out.print(" "+ arr[i]);
        }
    }
}
