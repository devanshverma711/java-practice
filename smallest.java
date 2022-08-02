import java.util.*;


public class smallest {
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
        System.out.println((small(digits)));
    }

    private static int small(int[] digits) {
        Arrays.sort(digits);
        return digits[0];
    }
}
