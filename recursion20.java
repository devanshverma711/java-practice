import java.util.Arrays;

//Sum triangle from array

public class recursion20 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
       // for(int i =0;i<arr.length;i++){
       //     System.out.print(arr[i] +" ");
       // }
       // System.out.println();
       // sumTriangle(arr,arr.length);
        suumTriangle(arr);
    }

    static void sumTriangle(int[] arr,int length){
        if(length==1){
            return;
        }
        
        for(int i =0;i<length-1;i++){
            arr[i]=arr[i]+arr[i+1];   
        }

        System.out.print(Arrays.toString(arr));
        System.out.println();
        sumTriangle(arr,length-1);
        
}

    static void suumTriangle(int[] arr){
        if(arr.length==1){
            return;
        }

        int[] temp = new int[arr.length-1];
        for(int i=0;i<arr.length-1;i++){
            int x= arr[i] + arr[i+1];
            temp[i]=x;
        }

        suumTriangle(temp);

        System.out.println(Arrays.toString(temp));
    }

}
