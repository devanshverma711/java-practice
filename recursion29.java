import java.util.*;

public class recursion29 {
    public static void main(String[] args) {
        subseq(" ", "abc");
        System.out.println(subseq(" ", "abc"));
    }

    static ArrayList<String> subseq(String p , String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> left = subseq(p, up.substring(1));
        ArrayList<String> right = subseq(p+ch, up.substring(1));

        left.addAll(right);
        return left;
    }
}
