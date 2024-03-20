package StringBuilder;
// If we create a string in memory, we can't add or delete in that. If we want to add/modify/delete, create a new string
// StringBuilder represents mutable sequence of characters whereas String Class creates an immutable sequence of characters
// StringBuilder class provides no guarantee of synchronization whereas the StringBuffer class does
// StringBuilder more efficient and better performance as compared to StringBuffer
// StringBuilder is not thread-safe


public class StringBuilder_methods {
    public static void main(String[] args) {

        String str="Hello";
        str.concat("World"); // For operation Need to create a new string like str_concat=str.concat("World");
        System.out.println(str);

        StringBuilder sb=new StringBuilder("Deep"); // pass a string "Deep"
        System.out.println(sb);
        // character at index 0
        System.out.println(sb.charAt(0));
        // set char at index
        sb.setCharAt(0,'K');
        System.out.println(sb);
        // insert char
        sb.insert(0,"To ");
        System.out.println(sb);
        // delete char - startIndex - inclusive and endIndex - exclusive
        sb.delete(0,3);
        System.out.println(sb);
        // append char
        sb.append(" away");
        System.out.println(sb);
        // length of string
        System.out.println(sb.length());
    }
}
