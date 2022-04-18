public class recursion16 {
    public static void main(String[] args) {
       System.out.println(" sum -> "+digits(3424));
       System.out.println(" production -> " +prod(3424));
    }

    static int digits(int n){
        if(n==0){
            return 0;
        }
        return  (n%10) + digits(n/10); 
    }

    static int prod(int n){
        if(n%10==n){
            return n;  
        }
        return (n%10)*prod(n/10);
    }
    
}
