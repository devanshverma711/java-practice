public class recursion27 {
    public static void main(String[] args) {
        System.out.println(skip("afsappleaF"));
    }

    static String skip(String p){
        if(p.isEmpty()){
            return "";
        }
        if(p.startsWith("apple")){
            return skip(p.substring(5));
        }else{
            return p.charAt(0)+skip(p.substring(1));
        }

    }
    
}
