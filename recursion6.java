//Tower of Hanoi

public class recursion6 {
    public static void main(String[] args) {
        int n=4;
        tower(n,"Source","Height","Destination");
    }
    public static void tower(int n,String s,String h,String d){
        if(n==1){
            System.out.println("transfer disk " + n + " from "+s + " to " + d );
            return;
        }
        tower(n-1,s,d,h);
        System.out.println("transfer disk " + n + " from "+s + " to " + d);
        tower(n-1,h,s,d);
    }
}
