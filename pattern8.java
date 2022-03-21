public class pattern8 {
    public static void main(String[] args){
        for(int i =1;i<=5;i++){
            for(int j =5;j>=i;j--){
                System.out.print(' ');
            }
            for(int t=1;t<=5;t++){
                System.out.print("+");
            }
            System.out.println();
       }
    }
}
