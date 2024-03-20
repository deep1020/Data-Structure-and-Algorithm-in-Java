package String;

public class check_string_palindrome {
    static boolean isPalindrome(String str){
        String modifiedString=str.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        String rev="";
        for(int i=modifiedString.length()-1;i>=0;i--){
            rev=rev+modifiedString.charAt(i);
        }
        if(modifiedString.equals(rev)){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        String str="a$b: ba";
        System.out.println(isPalindrome(str));
    }
}
