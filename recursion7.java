// reverse a string

public class recursion7 {
    public static void main(String[] args) {
        String a = "abcd";
        reverse(a,a.length()-1);
    }
    static void reverse(String a,int idx){
        if(idx==0){
            System.out.print(a.charAt(idx));
            return;
        }
        System.out.print(a.charAt(idx));
        reverse(a,idx-1);
    }
    
}
