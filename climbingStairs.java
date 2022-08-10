import java.util.Scanner;

public class climbingStairs {
    public static void main(String[] args) {
        System.out.println("Enter no.of Stairs");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(solution(n));
    }
    public static int solution(int n){
        if(n<=3){
            return n;
        }
        int f=0,s=1,t=f+s;
        for(int i=0;i<n;i++){
            t=f+s;
            f=s;
            s=t;
        }
        return t;
    }
}
