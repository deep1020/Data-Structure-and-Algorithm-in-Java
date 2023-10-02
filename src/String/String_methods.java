package String;

import java.util.Arrays;

public class String_methods {
    public static void main(String[] args) {
        // toUpperCase() and toLowerCase()
        String s1="Hello";
        System.out.println(s1.toUpperCase());
        System.out.println(s1.toLowerCase());

        // toCharArray() -> converts the given string into a sequence of characters.
        // returned array length is equal to the length of the string.
        char ch[]=s1.toCharArray();
        for(int i=0;i<ch.length;i++){
            System.out.println(ch[i]); // Hello
        }

        // trim() -> eliminates white spaces before and after the String
        String s2="  Hello  ";
        System.out.println(s2+s2.trim());

        // concat() -> combination of multiple strings.
        String concat_str=s2.concat("World");
        System.out.println(concat_str);

        // startsWith() and endsWith() -> checks whether the String starts/ends with the letters passed as arguments
        System.out.println(s1.startsWith("He")); //true
        System.out.println(s1.endsWith("O")); // false (require o)

        // charAt() -> returns a character at specified index
        System.out.println(s1.charAt(0)); //H
        System.out.println(s1.charAt(3)); //l

        // length() -> returns length of the specified String
        System.out.println(s1.length()); //6

        // valueOf() -> coverts given type such as int, long, float, double, boolean, char into String
        int a=10;
        String s3=String.valueOf(a);
        System.out.println(s3+10); //1010

        // replace() -> replaces all occurrence of first sequence of character with second sequence of character.
        String s4="Java is a programming language. Java is a platform.";
        String replaceString=s4.replace("Java","Kava");//replaces all occurrences of "Java" to "Kava"
        System.out.println(replaceString);

        // contains() method -> searches the sequence of characters in this string.
        // It returns true if the sequence of char values is found in this string otherwise returns false
        String con1="Hello World";
        System.out.println("Conatins: "+con1.contains("Hello")); // true
        String con2 = "Hello Deep";
        boolean isContains = con2.contains("deep"); // deep return false (case sensitive)
        System.out.println(isContains);
        String con3="Hello";
//        if(con3.contains("")){
//            System.out.println("String is null"); // NullPointerException
//        }
        if(con3.contains("e")){
            System.out.println("String contains 'e'");
        }

        // indexOf() method -> position of the first occurrence of the specified character or string
        String str_idx1="this is index of example";
        String str_idx2="this";
        int idx1=str_idx1.indexOf(str_idx2);
        System.out.println(idx1); // 0
        int idx2=str_idx1.indexOf("is",3);
        System.out.println(idx2); // 5 -> If substring not found it return -1

        // substring() method -> returns a part of the string
        String s="Hello";
        System.out.println(s.substring(0,2)); //He -> startIndex: inclusive, endIndex: exclusive
        System.out.println(s.substring(2)); //llo

        // split() method -> split the string into another string, store an array of string object
        String text= new String("Hello, World");
        /* Splits the sentence by the delimiter passed as an argument */
        String[] sentences = text.split("\\.");
        System.out.println(Arrays.toString(sentences));
        String[] sentences2 = text.split("\\s+");
        System.out.println(Arrays.toString(sentences2));
    }
}
