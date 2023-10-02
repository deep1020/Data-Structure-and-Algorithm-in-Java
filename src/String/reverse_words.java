package String;

import java.util.Arrays;
import java.util.Collections;

public class reverse_words {
    static String reveserWords(String s){
        s=s.trim();
        String words[]=s.split("\\s+"); // Matches one or more whitespace characters
        String ans="";
        for(int i=words.length-1;i>=0;i--){
            ans+=words[i]+" ";
        }
        return ans.substring(0,ans.length()-1);
    }
    public static void main(String[] args) {
        String s="   hello  world  ";
        System.out.println("'"+reveserWords(s)+"'");
        // string concatenation to combine the single quote ("'") with the word variable and then another single quote ("'").
        // This results in the original word being enclosed within single quotes.
    }
}

//static String reveserWords(String str){
//    str=str.trim();
//    String split_string[]=str.split("\\s+");
//    Collections.reverse(Arrays.asList(split_string));
//    return str.join("",split_string);
//}
//public static void main(String[] args) {
//    String str="  hello world  ";
//    System.out.println(reveserWords(str));
//}

// s=s.trim();
// String words[]=s.split("\\s+");
// StringBuilder ans=new StringBuilder();
// for(int i=words.length-1;i>=0;i--){
//     ans.append(words[i]);
//     if(i>0){
//         ans.append(" ");
//     }
// }
// return ans.toString();