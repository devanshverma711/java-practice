// Sum of n natural no.

public class recursion1 {
    public static void main(String[] args) {
        sumofno(5,0,1);
    }
    static int sumofno(int n,int sum,int i ){
        if(i==n){
            sum+=i;
            System.out.println(sum);
            return sum;
        }
        sum = sum  + i;
        sumofno(n,sum,i+1);

        return sum;
    }
}
