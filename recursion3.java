// Fibonaccoi series using Recursion

public class recursion3 {
    public static void main(String[] args) {
        int i=0;int j=1;
        System.out.println(i);
        System.out.println(j);
        int n=7;
        fibonacci(i,j,n-2);
    }
    static void fibonacci(int i,int j,int n){
        if(n==0){
            return;
        }
        int fibo=i+j;
        System.out.println(fibo);
        fibonacci(j,fibo,n-1);
        
    }
    
}
