public class recursion13 {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        System.out.print(a + " ");
        System.out.print(b+ " ");
        fibo(a,b);
        System.out.println(fibbo(3));
    }
    static void fibo(int a,int b){
        int n=a+b;
        System.out.print(n + " ");
        if(n>17){
            return;
        }
        fibo(a=b,b=n);
    }

    static int fibbo(int c){
    if(c<2){
        return c;
    }
    return fibbo(c-1)+fibbo(c-2);
}
}
