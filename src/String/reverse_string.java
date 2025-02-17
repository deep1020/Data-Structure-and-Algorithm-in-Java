package String;

public class reverse_string {
    static String reverseString(String s){
        char ch[]=s.toCharArray();
        int left=0;
        int right=ch.length-1;
        while(left<right){
            char temp=ch[left];
            ch[left]=ch[right];
            ch[right]=temp;
            left++;
            right--;
        }
        return new String(ch);
    }
    public static void main(String[] args) {
        String s="hello";
        System.out.println(reverseString(s));
    }
}
