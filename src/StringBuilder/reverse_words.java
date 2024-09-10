package StringBuilder;

public class reverse_words {
    static String reverseWords(String str){
        String words[]=str.split("\\s+");
        StringBuilder sb=new StringBuilder();
        for(int i=words.length-1;i>=0;i--){
            sb.append(words[i]);
            sb.append(" ");
        }
        return sb.toString().trim();
    }
    public static void main(String[] args) {
        String str="hello world";
        System.out.println(reverseWords(str));
    }
}
