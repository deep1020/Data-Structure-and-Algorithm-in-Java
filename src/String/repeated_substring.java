package String;

public class repeated_substring {
    public static boolean isSubstringPattern(String s) {
        int len = s.length();
        for (int i = 1; i <= len / 2; i++) {
            if (len % i == 0) {
                int num_repeated= len / i;
                String sub_string = s.substring(0, i);
                StringBuilder sb = new StringBuilder();
                for (int j = 0; j < num_repeated; j++) {
                    sb.append(sub_string);
                }
                if (sb.toString().equals(s)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String s1 = "abab";
        System.out.println(isSubstringPattern(s1));  // true
        String s2 = "aba";
        System.out.println(isSubstringPattern(s2));  // false
        String s3 = "abcabcabcabc";
        System.out.println(isSubstringPattern(s3));  // true
    }
}
