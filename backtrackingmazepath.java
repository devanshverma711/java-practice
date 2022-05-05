import java.util.Arrays;

public class backtrackingmazepath {
    public static void main(String[] args) {
        boolean[][] maze={
            {true,true,true},
            {true,true,true},
            {true,true,true}
        };
        int[][] path =new int [maze.length][maze[0].length];
        mazepath("",maze,0,0,path,1);
    }
    static void mazepath(String p,boolean[][] maze,int r,int c,int[][] path,int count){
        if(r==maze.length-1 && c==maze[0].length-1){
            path[r][c]=count;
           for(int[] arr:path){
                System.out.println(Arrays.toString(arr));
           }
           System.out.println(p);
           System.out.println();
            return;
        }
        if(!maze[r][c]){
            return;
        }
        maze[r][c]=false;
        path[r][c]=count;
        if(r<maze.length-1){
            mazepath(p+'D', maze, r+1, c, path, count+1);
        }
        if(c<maze[0].length-1){
            mazepath(p+'R', maze, r, c+1, path, count+1);
        }
        if(r>0){
            mazepath(p+'U', maze, r-1, c, path, count+1);
        }
        if(c>0){
            mazepath(p+'L', maze, r, c-1, path, count+1);
        }
        maze[r][c]=true;
    }
}
