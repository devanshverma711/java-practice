import java.util.Scanner;

class Poorpigs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of buckets");
        int buckets = sc.nextInt();
        System.out.println("Enter minutes to die");
        int minutesToDie = sc.nextInt();
        System.out.println("Enter minutes to test");
        int minutesToTest = sc.nextInt();
        System.out.println(poorPigs(buckets,minutesToDie,minutesToTest));
    }
        static int poorPigs(int buckets, int minutesToDie, int minutesToTest) {
            //int periods = (int)Math.ceil( minutesToTest/minutesToDie);
            //return (int)Math.ceil(Math.log(buckets)/Math.log(periods+1));
            int pigs =0;
            int time = (minutesToTest/minutesToDie+1);
            while(Math.pow(time,pigs)<buckets){
                pigs+=1;
            }
            return pigs;
        }
    }
