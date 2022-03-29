import java.util.*;
public class updatebit {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            int i = sc.nextInt();
            int n =5;
            int pos =1;
            int bitmask = 1<<pos;

            if(i==1){
                // clear
                int newbitmask = ~(bitmask);
                int newNumber = newbitmask & n;
                System.out.println(newNumber);
            }
            else{
                // set
                int newNumber = bitmask | n;
                System.out.println(newNumber);
            }
        }

    }    
}
