// maze cout of paths

public class maze {
    public static void main(String[] args){
       // System.out.println(maze(3,3));
        path("",3,3);
    }
    static int maze(int r,int c){
        if(r==1 || c==1){
            return 1;
        }

        int left = maze(r-1,c);
        int right = maze (r,c-1);
        return left +right;    
    }

    static void path(String p, int r, int c){
        if(r==1 && c==1){
            System.out.print(p +" ");
            return;
        }
        if(r>1 && c>1){
            path(p+'D', r-1, c-1);
        }
        
        if(r>1){
            path(p+'V', r-1, c);
        }
        if(c>1){
            path(p+'H',r,c-1);
        }

    }
}
