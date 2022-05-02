import java.lang.Character.Subset;

public class recursion28 {
    public static void main(String[] args) {
        Subsec("","abs");
    }
    static void Subsec(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        Subsec(p+ch, up.substring(1));
        Subsec(p, up.substring(1));
    }
}
