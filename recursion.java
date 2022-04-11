public class recursion {
    public static void main(String[] args){
        int n = 5;
       
        printno(n);
    }
    static void printno(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        printno(n-1); 
    }
    
}
