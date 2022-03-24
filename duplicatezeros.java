//Given a fixed-length integer array arr, duplicate each occurrence of zero, shifting the remaining elements to the right.
import java.util.*;
public class duplicatezeros{
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter size of array");
            int size = sc.nextInt();
            int[] arr = new int[size];
            for(int i =0;i<size;i++){
                System.out.println("Enter elements");
                arr[i]=sc.nextInt();
            }
            duplicateZeros(arr);
        }
    } 

    public static void duplicateZeros(int[] arr) {
        // int length=0;
         for(int i=0;i<arr.length-1;i++){
             if(arr[i]==0){
                 for(int j=arr.length-1;j>i;j--){
                     arr[j]=arr[j-1];
                 }
                 arr[i+1]=0;  
                 i++;
         }
         }
         System.out.println("Duplicate Zeros array is ");
         for(int i=0;i<arr.length;i++){
             System.out.print(arr[i]);
     }
} 
}