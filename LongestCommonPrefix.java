import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = {"flower","fow","flight"};
       System.out.println(solution(strs));
    }
    public static String solution(String[] strs){
        int n = strs.length;
        if(n==0){
            return "";
        }
        Arrays.sort(strs);
        String a = strs[0];
        String b = strs[n-1];
        String ans = "";

        for(int i =0;i<a.length();i++){
            if(a.charAt(i)==b.charAt(i)){
                ans+=a.charAt(i);
            }else{
                break;
            }
        }
        return ans;
    }
}
