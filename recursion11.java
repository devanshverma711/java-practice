public class recursion11 {
    public static void main(String[] args) {
        String str = "aabhbjf";
        duplicate(str,0," ");
    }
    static void duplicate(String str , int idx,String newString){
        char i=str.charAt(idx);
        for(int j =0;i<str.length();j++){
            if(idx!=j){
                if(i!=str.charAt(j)){
                    j++;
                }
            }
        }
    }   
}
