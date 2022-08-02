import java.util.Arrays;
import java.util.Scanner;

public class Largest {
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
        System.out.println((large(digits)));
    }

    private static int large(int[] digits) {
        Arrays.sort(digits);
        return digits[digits.length-1];
    }
}
