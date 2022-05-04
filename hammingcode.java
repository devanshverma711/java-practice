import java.util.Scanner;

public class hammingcode {
    public static void main(String[] args) {
        int[] data = new int[10];
        int[] dataatrec = new int[10];
        int c,c1,c2,c3,i;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter 4 bits of data one by one");
            for(int j =0;j<4;j++){
                data[j]=sc.nextInt();
            }

            //     Calculation of even parity
            data[6]=data[0]^data[2]^data[4];
            data[5]=data[0]^data[1]^data[4];
            data[3]=data[0]^data[1]^data[2];

            System.out.println("Encoded data is");
            for(i=0;i<7;i++){
               System.out.println(data[i]);
            }

            System.out.println("Enter received data bits one by one");
            for(int k=0;k<7;k++){
                dataatrec[k]=sc.nextInt();
            }
        }
        
        c1=dataatrec[6]^dataatrec[4]^dataatrec[2]^dataatrec[0];
        c2=dataatrec[5]^dataatrec[4]^dataatrec[1]^dataatrec[0];
        c3=dataatrec[3]^dataatrec[2]^dataatrec[1]^dataatrec[0];
        c=c3*4+c2*2+c1 ;
        
        if(c==0) {
            System.out.println("\nNo error while transmission of data\n");
        }else {
            System.out.println("Error on position %d"+ c);
        }

        System.out.println("Data sent : ");
            for(i=0;i<7;i++){
               System.out.println(data[i]);
            }

        System.out.println("Data sent : ");
            for(i=0;i<7;i++){
               System.out.println(dataatrec[i]);
            }

        System.out.println("correct message is ");

//if errorneous bit is 0 we complement it else vice versa
        if(dataatrec[7-c]==0){
            dataatrec[7-c]=1;
        }else{
            dataatrec[7-c]=0;
        }
        for (i=0;i<7;i++) { 
            System.out.println(dataatrec[i]);
        }
    }
    
}

