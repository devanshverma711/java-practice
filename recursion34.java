public class recursion34 {
    public static void main(String[] args) {
       System.out.println(countpaths(0, 0, 3, 3));
    }

    static int countpaths(int i,int j,int m,int n){
        if(i==m || j==n){
            return 0;
        }
        
        if(i==m-1 && j==n-1){
            return 1;
        }
        int downpath = countpaths(i+1, j, m, n);
        int rightpath = countpaths(i, j+1, m, n);

        return downpath+rightpath;
        
    }
    
}
