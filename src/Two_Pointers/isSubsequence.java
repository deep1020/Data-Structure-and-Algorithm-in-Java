package Two_Pointers;

public class isSubsequence {
    static boolean isSubsequence(String str1,String str2){
        int left=0;
        int right=0;
        while(left<str1.length() && right<str2.length()){
            if(str1.charAt(left)==str2.charAt(right)){
                left++;
            }
            right++;
        }
        if(left==str1.length()){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        String str1="abc";
        String str2="ahbgdc";
        System.out.println(isSubsequence(str1,str2));
    }
}
// T.C -> O(n+m) where n=number of character in s and m=number of character in t
// S.C -> O(1)

// Loop go through length of str1 and str2
// check index of str1 and str2 to match character
// If both character match at specified index then move index of str1 right side until it's length else move index of str2
// If s is subsequence of str2 i.e left is equals to a same length of str1 then return true
// otherwise it return false