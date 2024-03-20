package StringBuilder;

public class reverse_words_StringBuilder {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("hello world");
        for(int i=0;i<sb.length()/2;i++){
            int left=i; // 2nd position at 'e' -> i=1
            int right=sb.length()-1-i; // last 2ns position at 'l' -> 5-1-1=3
            char leftChar=sb.charAt(left);
            char rightChar=sb.charAt(right);
            sb.setCharAt(left,rightChar);
            sb.setCharAt(right,leftChar);
        }
        System.out.println(sb);
    }
}
// setCharAt(int index, char ch): the character at the specified index is set to ch.
