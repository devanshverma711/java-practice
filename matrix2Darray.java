import java.util.*;
public class matrix2Darray {
    public static void main(String[] args){

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter no of rows");
            int row = sc.nextInt();

            System.out.println("Enter no of columns");
            int column = sc.nextInt();
        
            int[][] arr= new int[row][column];
        for(int i =0;i<row;i++){
            for(int j =0;j<column;j++){
                System.out.println("Enter element");
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter no to search");
        int target = sc.nextInt(); 
        for(int i =0;i<row;i++){
            for(int j =0;j<column;j++){
                if(arr[i][j]==target){
                    System.out.println("Element is present at "+ i +" "+ j);
                }
            }
        }
        }
    }
    
}
