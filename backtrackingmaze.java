public class backtrackingmaze {
    public static void main(String[] args) {
        boolean[][] grid = {
            {true,true,true},
            {true,true,true},
            {true,true,true}
        };

        path("",grid,0,0);
    }

    static void path(String p,boolean[][] grid,int r,int c){
        if(r==grid.length-1 && c==grid[0].length-1){
            System.out.println(p);
            return;
        }
        
        if(!grid[r][c]){
            return;
        }
    
        grid[r][c]=false;

        if(r<grid.length-1){
            path(p+'D', grid, r+1, c);
        }
        if(c<grid[0].length-1){
            path(p+'R',grid,r,c+1);
        }
        if(r>0){
            path(p+'U', grid, r-1, c);
        }
        if(c>0){
            path(p+'L', grid, r, c-1);
        }

        grid[r][c]=true;
    }
}
