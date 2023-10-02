package Recursion;

public class reverse_string {
    static void printReverse(String str){
        if(str.length()==1){
            System.out.println(str);
            return;
        }
        System.out.print(str.charAt(str.length()-1));
        printReverse(str.substring(0,str.length()-1));
    }
    public static void main(String[] args) {
        String str="abcd xyz";
        printReverse(str);
    }
}
// T.C -> O(n)
// S.C -> O(n)

//static void printReverse(String str,int idx){
//    if(idx==0){
//        System.out.println(str.charAt(idx));
//        return;
//    }
//    System.out.print(str.charAt(idx));
//    printReverse(str,idx-1);
//}
//public static void main(String[] args) {
//    String str="abcd";
//    printReverse(str,str.length()-1);
//}