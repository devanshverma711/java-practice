import java.util.*;
public class mergesortedarray {
        public static void main(String[] args){
            try (Scanner sc = new Scanner(System.in)) {
                System.out.println("Enter  size of 1st array");
                int n = sc.nextInt();
    
                System.out.println("Enter size of 2nd array");
                int m = sc.nextInt();

                int[] num2 = new int[m];
                for(int j =0;j<m;j++){
                    System.out.println("Enter elements 2nd aray");
                    num2[j]=sc.nextInt();
                }
                 int[] num1 = new int[n+m];
                 for(int i =0;i<n;i++){
                     System.out.println("Enter elements of 1st array");
                     num1[i]=sc.nextInt();
                 }
                    merge(num1,n,num2,m);
            }
        } 
        public static void merge(int[] num1, int m, int[] num2, int n) {
            for(int i=0;i<n;i++){
                     num1[m+i]=num2[i];
                }
                Arrays.sort(num1);
                for(int i =0 ;i<num1.length;i++){
                    System.out.print("  "+num1[i]);
                }
    }
    
}
