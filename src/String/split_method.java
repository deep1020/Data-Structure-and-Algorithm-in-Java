package String;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class split_method {
    public static void main(String[] args) {
        String text = "a good      example ";
        text.trim();
        String str[] = text.split("\\s+");
        Collections.reverse(Arrays.asList(str));
//        List<String> wordList = Arrays.asList(text.split("\\s+"));
//        Collections.reverse(wordList);
        System.out.println(text.join(" ", str));
        System.out.println("--------------");

        String s1 = "welcome to split world";
        System.out.println("returning words:");
        for (String w : s1.split("\\s", 0)) {
            System.out.println(w);
        }
        System.out.println("returning words:");
        for (String w : s1.split("\\s", 1)) {
            System.out.println(w);
        }
        System.out.println("returning words:");
        for (String w : s1.split("\\s", 2)) {
            System.out.println(w);
        }
        System.out.println("--------------");
        String str2 = "geekss@for@geekss";
        System.out.println("Returning words:");
        String[] arr = str2.split("s", 2);
        for (String w : arr) {
            System.out.println(w);
        }
        System.out.println("Split array length: " + arr.length);

        System.out.println("--------------");
        String s2 = "java string split method by    javatpoint";
        String[] words = s2.split("\\s+");//splits the string based on whitespace
        for (String w : words) {
            System.out.println(w);
        }
    }
}
