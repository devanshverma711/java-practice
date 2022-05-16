public class search2Darray {
    public static void main(String[] args) {
        int[][] matrix ={
            {1,4,6,8},
            {10,16,17,18},
            {32,36,75,87}};
        int target = 8;
        System.out.println(searchMatrix(matrix, target));
    }
    public static boolean searchMatrix(int[][] matrix, int target) {
        int i = 0, j = matrix[0].length - 1;
        while(i < matrix.length && j >= 0) {
          if(matrix[i][j] == target)
            return true;
          else if(matrix[i][j] > target)
            j --;
          else if(matrix[i][j] < target)
            i ++;
        }
        return false;
      }
}
