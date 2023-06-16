package String;

import java.util.Arrays;
import java.util.StringJoiner;

public class concatenation_string {
    public static void main(String[] args) {

        // + operator
        String s1="Hello"+" World";
        System.out.println("Using + operator: "+s1);

        // concat() method
        String s2="Hello";
        String s3="World";
        String s4=s2.concat(s3);
        System.out.println("Using concat() method: "+s3);

        // join() method
        String str1="deep";
        str1.join("patel");
        System.out.println(str1);

        // StringBuilder class -> values stored in StringBuilder objects can be updated or changed.
        StringBuilder sb1=new StringBuilder("Hello");
        sb1.append("World");  // don't need to assign variable like this sb1=sb1.append("World")
        System.out.println("Using StringBuilder: "+sb1.toString()); // display result

        // format() method -> allows to concatenate multiple strings using format specifier like %s
        String str_format=String.format("%s %s %s",s2,s3,str1);
        System.out.println("Using format() method: "+str_format.toString());

        // join() method
        String str_join=String.join("",s2,s3);
        System.out.println("Using join() method: "+str_join.toString());

        // StringJoiner class -> accept optional arguments, prefix and suffix.
        StringJoiner str_joiner=new StringJoiner(" ");
        str_joiner.add("Hello");
        str_joiner.add("World");
        System.out.println("Using StringJoiner: "+str_joiner.toString());


    }
}
