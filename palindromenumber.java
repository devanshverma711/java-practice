import java.util.*;
public class palindromenumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(isPalindrome(x));
    }
        static boolean isPalindrome(int x) {
            if(x==0){
                return true;
            }
            int num=x;
            int reverse=0;
            while(num>0){
                reverse = reverse*10+num%10;
                num = num/10;
            }
            if(x==reverse){
                return true;
            }
            return false;
            
        }
    }
