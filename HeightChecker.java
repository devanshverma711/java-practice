import java.util.*;
public class HeightChecker {
    public static void main(String[] args){
        //Scanner sc = new Scanner(System.in);
        //int size =sc.nextInt();
        int [] height={1,1,4,2,1,3};
        System.out.println(heightChecker(height));
    }
     public static int heightChecker(int[] height) {
        int[] expected =new int[height.length];
        for(int i=0;i<height.length;i++){
            expected[i]=height[i];
        }
        int l=0;
        Arrays.sort(expected);
        for(int j=0;j<height.length;j++){
            if(expected[j]!=height[j]){
                l++;
            }
        }
        return l;
    }
}
