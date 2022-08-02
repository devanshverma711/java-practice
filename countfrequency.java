import java.util.Arrays;
import java.util.Scanner;

public class countfrequency {
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
        count(digits);
    }
    public static void count(int[] digits){
        boolean visited[] = new boolean[digits.length];

        for (int i = 0; i < digits.length; i++) {

            // Skip this element if already processed
            if (visited[i] == true)
                continue;

            // Count frequency
            int count = 1;
            for (int j = i + 1; j < digits.length; j++) {
                if (digits[i] == digits[j]) {
                    visited[j] = true;
                    count++;
                }
            }
            System.out.println(digits[i] + " " + count);
        }
    }
}