import java.util.*;

public class aiWaterJugfinal {
    
    static int x;
	static int y;
    static int min(int w , int z){
        return w < z ? w:z;
    }

    static void show(int a ,int b){
        System.out.println("   "+a+"              "+b);
        
    }

    static void s(int n,int m){
        int xq=0, yq=0;
        int t;
        System.out.println("FIRST JUG " + "    "+ " SECOND JUG ");
        while(xq != n && yq != n || xq != m && yq != m)
        {
            if(xq == 0){
                xq=x;
                show(xq,yq);
            }
            else if(yq == y){
                yq = 0;
                show(xq,yq);
            }
            else{
                t = min(y-yq,xq);
                yq = yq + t;
                xq = xq - t;
                show(xq,yq);
            }
        }
    }

    public static int getGCD(int q,int r){
        if(r==0){
            return q;
       }
    
            return getGCD(r,q%r);
        } 

    
    public static void main(String[] args) {
        int n,m;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the litres of water required out of the two jugs: ");
            n=sc.nextInt();
        System.out.println("Enter the litres of water required out of the two jugs: ");
            m=sc.nextInt();
        System.out.println("Enter the capacity of the first jug: ");
            x=sc.nextInt();
        System.out.println("Enter the capacity of the second jug: ");
            y=sc.nextInt();

        sc.close();

        if(n<x || n<y){
            if(n%(getGCD(x, y))==0)
                s(n,m);
            else
                System.out.println("This is not possible");
        }
        else
            System.out.println("This is not possible");
    }   
    
}
