package StringBuilder;

public class run_length_encoding {
    static String doEncode(String str){
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<str.length();i++){
            int count=1;
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            }
            sb.append(str.charAt(i));
            sb.append(count);
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String str="aabaccabdb";
        System.out.println(doEncode(str));
    }
}
// Output: a2b1a1c2a1b1d1b1

// T.C -> O(n)
// Outer for loop runs n times, where n= length of input string 'str'
// Inner while loop may also run multiple times, but in total, across all iterations of outer loop. It will run maximum of n times
// Each character and its count are appended to StringBuilder

// S.C -> O(n)
// StringBuilder sb will store the encoded string, which, in the worst case, can be of length 2n
// Variables count and i are used, but they consume constant space