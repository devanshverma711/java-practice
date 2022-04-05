import java.util.*;
public class Containerwithmostwater {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("ENter size of array");
            int size = sc.nextInt();
            int[] height = new int[size];
            System.out.println("ENter array element");
            for(int i = 0;i<size;i++){
                height[i]=sc.nextInt();
            }
            System.out.println(maxArea(height));
        }
    }
    public static int maxArea(int[] height) {
        int ans = 0, i = 0, j = height.length-1, res = 0;
        while (i < j) {
            if (height[i] <= height[j]) {
                res = height[i] * (j - i);
                i++;
            } else {
                res = height[j] * (j - i);
                j--;
            }
            if (res > ans) ans = res;
        }
        return ans;
      }
}
