import java.util.Arrays;

public class reshape2Darray {
    public static void main(String[] args) {
        int[][] mat= {
            {1,2},
            {5,2},
        };
        int r=1;
        int c=4;

       //System.out.println(Arrays.toString(reshape(mat,r,c)));
       reshape(mat,r,c);
    }

    private static void reshape(int[][] mat, int r, int c) {
        
        int matr=mat.length;
        int matc=mat[0].length;

        if(matr*matc!=r*c){
            return ;
        }

        int c1=0;
        int r1=0;
        int[][] arr= new int[r][c];
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat.length;j++){
                if(c1==c){
                    c=0;
                    r1++;
                }
                arr[r1][c1]=mat[i][j];
                c1++;
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
    }
}
}
