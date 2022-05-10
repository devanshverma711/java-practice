public class backtrackingpermutations {
    public static void main(String[] args) {
        printpermutation("ABC", "", 0);
    }

    static void printpermutation(String str,String perm,int idx){
        if(str.length()==0){
            System.out.println(perm);
            return;
        }

        for(int i=0;i<str.length();i++){
            char curr = str.charAt(i);
            String newstr = str.substring(0,i)+str.substring(i+1);
            printpermutation(newstr, perm+curr, idx+1);
        }

    }
}
