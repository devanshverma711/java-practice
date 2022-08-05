public class Stringbuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);
        sb.append("o");
        System.out.println(sb);
        sb.insert(2, "t");
        System.out.println(sb);
        sb.delete(2, 5);
        System.out.println(sb);
        sb.append("you");
        System.out.println(sb);

        System.out.println(sb.length());

        for(int i =0;i<sb.length()/2;i++){
            int front = i;
            int back = sb.length()-1-i;

            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);

            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);
        }
        System.out.println(sb);
    }
}
