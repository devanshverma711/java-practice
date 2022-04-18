public class recursion15 {
    public static void main(String[] args) {
        System.out.println(factorial(5));
        System.out.println(sum(5));
    }

    static void linear(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        linear(n-1);
    }

    static void reverse(int n){
        if(n==0){
            return;
        }
        linear(n-1);
        System.out.println(n);
    }

    static void both(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        linear(n-1);
        System.out.println(n);
    }
    
    static int factorial(int n){
        if(n <= 1){
            return 1;
        }
        return factorial(n-1)*n;
        
    }

    static int sum(int n){
        if(n <= 1){
            return 1;
        }
        return sum(n-1)+n;
        
    }
}
