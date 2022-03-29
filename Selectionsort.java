import java.util.*; 
public class Selectionsort {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
           
            //time complexity = 0(n^2)
            //Selection Sort

            int size = sc.nextInt(); 
            int[] arr = new int[size];
            for(int i =0;i<arr.length;i++){
                arr[i]=sc.nextInt();
            }
            for(int i =0;i<arr.length;i++){
                System.out.print(" "+arr[i]);
            }
            Selection(arr);
        }
    }    
    static void Selection(int[] arr){
        
        for(int i = 0 ;i<arr.length-1;i++){
            int min = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
                int temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
        }
        System.out.println();
        for(int i =0;i<arr.length;i++){
            System.out.print(" "+ arr[i]);
            }
    }
        
}
