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
        // Count freqency of each character in string
//        int count[]=new int[26];
//        for(char c:s1.toCharArray()){
//            count[c-'a']++;
//        } // OR
//        for(int i=0;i<s1.length();i++){
//            count[s1.charAt(i)-'a']++;
//        }

        // trim() -> eliminates white spaces before and after the String
        String s2="  Hello  ";
        System.out.println(s2+s2.trim());

        // startsWith() and endsWith() -> checks whether the String starts/ends with the letters passed as arguments
        String st1="Hello Java";
        System.out.println(st1.startsWith("He")); //true
        System.out.println(s1.endsWith("A")); // false (require a lowercase)
        System.out.println(st1.startsWith("Ja",6)); // 'Ja' is starting at index 6 so true

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

        // startWith() method -> check whether the string starts with a specific prefix (Return true or false)
        System.out.println("Check whether string 'Hello' start with 'H': "+s.startsWith("H"));

        // compareTo() method -> compares the given string with the current string lexicographically.
        // It returns a positive number, a negative number, or 0.
        // If s1==s2, return 0. If s1>s2, return positive value. If s1<s2, return negative value
        // It compares strings based on the Unicode value of each character in the strings.
        String str1="geeksforgeeks";
        String str2=new String("geeksforgeeks");
        String str3="geek";
        int comparison1=str1.compareTo(str2);
        if(comparison1<0){
            System.out.println(str1+" comes before "+str2+" in lexicographical order ");
        }
        else if(comparison1<0){
            System.out.println(str1+" comes after "+str2+" in lexicographical order ");
        }
        else{
            System.out.println(str1+" and "+str2+" are lexicographically equal");
        }
        int comparison2=str1.compareTo(str3);
        System.out.println("Difference of geeksforgeeks and geeks: "+comparison2);

        // split() method -> split the string into another string, store an array of string object
        String text= new String("Hello, World");
        /* Splits the sentence by the delimiter passed as an argument */
        String[] sentences = text.split("\\.");
        System.out.println("After split: "+sentences.length);
        System.out.println(Arrays.toString(sentences));
        String[] sentences2 = text.split("\\s+");
        System.out.println(Arrays.toString(sentences2));
    }
}
