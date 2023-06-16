package String;

public class count_character {

    public static void main(String[] args) {
        String str="Hello World";
        char ch='l';
        int res = 0;
        for (int i=0; i<str.length(); i++) {
            if (str.charAt(i) == ch) {
                res++;
            }
        }
        System.out.println(res);
    }
}
