package Two_Pointers;

public class check_string_palindrome {
    static boolean isPalindrome(String str){
        int left=0;
        int right=str.length()-1;
        while (left<right){
            char leftChar=Character.toLowerCase(str.charAt(left));
            char rightChar=Character.toLowerCase(str.charAt(right));
            if(!Character.isLetterOrDigit(leftChar)){
                left++; // skip left, go to lift+1
            }
            else if (!Character.isLetterOrDigit(rightChar)){
                right--; // skip right, go to right-1
            }
            else {
                if(leftChar!=rightChar){
                    return false;
                }
                left++;
                right--;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str="a$b: ba";
        System.out.println(isPalindrome(str));
    }
}
