public class recursion33 {
    public static void main(String[] args) {
        printperm("abc", "");
    }

    static void printperm(String str,String permutation){
        if(str.isEmpty()){
            System.out.println(permutation);
            return;
        }
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            String newstr = str.substring(0, i)+str.substring(i+1);
            printperm(newstr, permutation+ch);
        }
    }
    
}
