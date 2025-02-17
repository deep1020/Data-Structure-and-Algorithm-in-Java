package String;

public class check_string_palindrome {
//    static boolean isPalindrome(String str){
//        String modifiedString=str.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
//        String rev="";
//        for(int i=modifiedString.length()-1;i>=0;i--){
//            rev=rev+modifiedString.charAt(i);
//        }
//        if(modifiedString.equals(rev)){
//            return true;
//        }
//        return false;
//    }

    static boolean isPalindrome(String str){
        int left=0;
        int right=str.length()-1;
        while(left<right){
            char ch1=str.charAt(left);
            char ch2=str.charAt(right);
            if(ch1!=ch2){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        String str="ab:ba";
//        String str="babab";
        System.out.println(isPalindrome(str));
    }
}
