// Strictly sorted array 

public class recursion9 {
    public static void main(String[] args) {
        int[] array = {1,3,4,6,7,8};
        System.out.println(check(array,0));
    }
    static boolean check(int[] array,int l){
        if(array[l]==array.length-2){
            return true;
        }
        if(array[l]<array[l+1]){
                return check(array,l+1);
         }
         else{
             return false;
        }
    }
}
