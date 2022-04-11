public class recursion2 {
    public static void main(String[] args){
        int n =5;
        
        System.out.println(factorial(n));
    }
    static int factorial(int n){
        if(n==0 || n==1) {
            return 1;
        }
        int fact =factorial(n-1);
        fact =n*fact;
        return fact;

    }
    
}
