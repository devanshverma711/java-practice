import java.util.*;

public class Singleno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of array");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter array values");
        for(int i = 0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Array is");
        for(int i = 0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println(solution(arr));
    }
     static int solution(int[] arr){
        int n = arr.length;
        boolean [] visited = new boolean[n];
        for(int i =0;i<n;i++){
            if(visited[i]==true){
                continue;
            }
            int count=1;
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    visited[j]=true;
                    count++;
                }
            }
            if(count==1)
                return arr[i];
        }
        return 0;
     }
}
