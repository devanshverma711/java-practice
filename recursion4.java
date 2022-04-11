// Stack height x

public class recursion4 {
    public static void main(String[] args) {
        int n =5;
        int x =2;
        System.out.println(stackk(x,n));
    }
    static int stackk(int x ,int n){
        if(x==0){
            return 0;
        }
        if(n==0){
            return 1;
        }
        int height = stackk(x,n-1);
        int xpower = x * height;
        return xpower;
    }
    
}
