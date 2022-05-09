import java.util.Scanner;

public class percentagecalculater {
    public static void main(String[] args) {
        int[] marks = new int[5];
        in(marks);
    }
    static void in(int[] marks){
        try (Scanner sc = new Scanner(System.in)) {
            for(int i=0;i<5;i++){
                marks[i]=sc.nextInt();
            }
        }
            int sum =0;
            for(int i=0;i<5;i++){
                sum= marks[i]+sum;
            }
            System.out.println(sum);
            float percentage=sum*100/(500);
            System.out.println(percentage);
    }
}
