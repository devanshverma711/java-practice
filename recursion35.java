public class recursion35 {
    public static void main(String[] args) {
       System.out.println(tiles(4, 2));
    }
    
    static int tiles(int n,int m){
        if(n==m){
            return 2;
        }
        if(n<m){
            return 1;
        }

        int placehori= tiles(n-m,m);
        int placeverti= tiles(n-1,m);

        return placehori+placeverti;
    }
}
