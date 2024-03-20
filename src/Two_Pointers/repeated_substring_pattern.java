package Two_Pointers;

public class repeated_substring_pattern {
    static boolean repeatedSubstring(String s){
        int n=s.length();
        for(int l=n/2;l>0;l--){
            if(n%l==0){
                int i=0;
                int j=l;
                while(j<n && s.charAt(i)==s.charAt(j)){
                    i++;
                    j++;
                }
                if(j==n){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String test_str="abac";
        System.out.println(repeatedSubstring(test_str));
    }
}

// i=0,j=1
