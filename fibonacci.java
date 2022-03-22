public class fibonacci {
    public static void main(String[] args){
        int n=6 ;
        int first =0;
        int second = 1;
        System.out.println(first + "\n" + second );
        for(int i=2;i<=n;i++){ 
            int third=first+second;
            first=second;
            second=third;
            System.out.println(third);
    }
}
}
