import java.util.Arrays;
import java.util.Scanner;

public class Plusone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of Array");
        int n = sc.nextInt();
        int[] digits = new int[n];
        System.out.println("Enter digits of Array");
        for(int i=0;i<n;i++){
            digits[i]=sc.nextInt();
        }
        System.out.println("Array is -- ");
        for(int i=0;i<n;i++){
            System.out.print(digits[i] +" ");
        }
        System.out.println();
        System.out.println(Arrays.toString(plusOne(digits)));
    }
    public static int[] plusOne(int[] digits) {
        int n=digits.length;
        for(int i =n-1;i>=0;i--){
            if(digits[i]!=9){
                digits[i]++;
                break;
            }
            else{
                digits[i]=0;
            }
        }
        if(digits[0]==0){
            int[] arr = new int[n+1];
            arr[0]=1;
            return arr;
        }
        return digits;
    }
}
