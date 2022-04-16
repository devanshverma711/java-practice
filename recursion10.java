// moving x at the end

public class recursion10 {
    public static void main(String[] args) {
        String str = "ssxxwefx";
        move(str,0,0," ");
    }
    static void move(String str ,int idx,int count, String newString){
        
        if(idx==str.length()){
            for(int i = 0;i<count;i++){
                newString+='x';
            }
            System.out.println(newString);
            return;
        }
        if(str.charAt(idx)=='x'){
            count++;
            move(str ,idx+1, count,newString);
        }
        else{
            newString+=str.charAt(idx);
            move(str ,idx+1, count,newString);
        }
    }
    
}
