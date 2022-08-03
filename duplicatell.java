import java.util.HashMap;
import java.util.Scanner;

    public class duplicatell {
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
            System.out.println("Enter the difference between duplicate should be");
            int k = sc.nextInt();

            System.out.println(solution(arr,k));
        }
        static boolean solution(int[] arr,int k){
            HashMap<Integer,Integer> map = new HashMap<>();
            for(int i =0;i<arr.length;i++){
                int current=arr[i];
                if(map.containsKey(current) && i-map.get(current)<=k){
                    return true;
                }
                else{
                    map.put(current,i);
                }
            }
            return false;
    }
}
