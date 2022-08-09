public class xatlast {
    public static void main(String[] args) {
        String s = "axbsxdsx";
        last(s,"",0,0);
    }

    private static void last(String s,String s1,int count,int idx) {
        if(idx == s.length()){
            for(int i=0 ;i<count;i++){
                s1+='x';
            }
            System.out.println(s1);
            return ;
        }
        char currChar = s.charAt(idx);
        if(currChar == 'x'){
            count ++;
            last(s,s1,count,idx+1);
        }else{
            s1+=currChar;
            last(s,s1,count,idx+1);
        }
    }
}
