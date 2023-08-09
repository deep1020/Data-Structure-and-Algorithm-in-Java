package String;

public class remove_first_last_character_string {
    static String removeFirstandLast(String str){
        str=str.substring(1,str.length()-1);
        return str;
    }
    public static void main(String[] args) {
        String str="Hello World";
        System.out.println(removeFirstandLast(str));
    }
}
