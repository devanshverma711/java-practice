import java.util.*;
class averageno{
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
      // int a =3; 
      //int b =3;
     //int c =3;
            avg(a,b,c);
        }
    }

    private static void avg(int a, int b, int c) {
        double avg=(a+b+c)/3;
        System.out.println(avg);
    }
}