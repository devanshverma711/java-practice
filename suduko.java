public class suduko {

    private static final int GRID_Size = 9;

    public static void main(String[] args) {
        
        int[][] board = {
            {7,0,2,0,5,0,6,0,0},
            {0,0,0,0,0,3,0,0,0},
            {1,0,0,0,0,9,5,0,0},
            {8,0,0,0,0,0,0,9,0},
            {0,4,3,0,0,0,7,5,0},
            {0,9,0,0,0,0,0,0,0},
            {0,0,9,7,0,0,0,0,5},
            {0,0,0,2,0,0,0,0,0},
            {0,0,7,0,4,0,2,0,3},
        };

        printBoard(board);

        if(solveBoard(board)){
            System.out.println("Solved Successfully");
        }else{
            System.out.println("Unsovable board :(");
        }

        printBoard(board);
        

    }
    private static void printBoard(int[][] board) {
        for(int row = 0;row<GRID_Size;row++){
            if(row%3==0 && row!= 0){
                System.out.println("- - - - - - - - ");
            }
            for(int column = 0;column<GRID_Size;column++){
                if(column%3==0 && column !=0){
                    System.out.print(" | ");
                }
                System.out.print(board[row][column]);
            }
            System.out.println();
        }
    }
    private static boolean isNumberInRow(int[][] board,int number,int row){
        for(int i=0;i<GRID_Size;i++){
            if(board[row][i]==number){
                return true;
            }
        }
        return false;
    }
    private static boolean isNumberInColumn(int[][] board,int number,int column){
        for(int i=0;i<GRID_Size;i++){
            if(board[i][column]==number){
                return true;
            }
        }
        return false;
    }
    private static boolean isNumberInBox(int[][] board,int number,int row,int column){
       int localBoxRow = row -row%3;
       int localBoxColumn = column - column%3;

       for(int i =localBoxRow;i<localBoxRow+3;i++){
           for(int j=localBoxColumn;j<localBoxColumn+3;j++){
               if(board[i][j] == number){
                   return true;
               }
           }
       }
       return false;
    }

    private static boolean isValidPlacement(int[][] board,int number,int row,int column){
        return !isNumberInRow(board, number, row) &&
            !isNumberInColumn(board, number, column) &&
            !isNumberInBox(board, number, row, column);
    }

    private static boolean solveBoard(int[][] board){
        for(int row=0;row<GRID_Size;row++){
            for(int column=0;column<GRID_Size;column++){
                if(board[row][column] == 0){
                    for(int numberTotry =1;numberTotry<=GRID_Size;numberTotry++){
                        if(isValidPlacement(board, numberTotry, row, column)){
                            board[row][column] = numberTotry; 

                            if(solveBoard(board)){
                                return true;
                            }
                            else{
                                board[row][column]=0;
                            }
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    } 
}
