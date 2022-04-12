// Occurance of first and last character in String
public class recursion8 {
    public static int first = 0;
    public static int last = -1;
    public static void main(String[] args) {
        String str = "abaacdaefaah";
        find(str,0,'a');
    }
    static void find(String str, int s,char target){
        if(s==str.length()-1){
            System.out.println("First occurance "+first);
            System.out.println("Last occurance "+last);
            return;
        }
        if(str.charAt(s)==target){
            if(first==-1){
                first = s;
            }
            else{
                last=s;
            }
        }
        find(str,s+1,target);
    }
}
