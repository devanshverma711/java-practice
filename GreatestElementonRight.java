import java.util.*;
public class GreatestElementonRight {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        replaceElements(arr);
    }
    public static void replaceElements(int[] arr) {
        int l=-1;int temp=0;
     for(int i = arr.length-1;i>=0;i--){
         temp=arr[i];
         arr[i]=l;
         if(l>temp){
             l=l;
         }
         else{
             l=temp;
         }
     }
     for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]);
    }
 }
}
