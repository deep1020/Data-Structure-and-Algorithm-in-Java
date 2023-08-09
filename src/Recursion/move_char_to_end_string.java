package Recursion;
// Easier than iterative method
public class move_char_to_end_string {
    static void moveAllX(String str,int idx){
        if(idx==str.length()){
            return;
        }
        char currChar=str.charAt(idx);
        if(currChar!='x'){
            System.out.print(currChar);
        }
        moveAllX(str,idx+1);
        if(currChar=='x'){
            System.out.print(currChar);
        }
    }
    public static void main(String[] args) {
        String str="axbcxxd";
        moveAllX(str,0);
    }
}
// T.C -> O(n) O(n+n) One n is for char=x and second n is for char!=x
// S.C -> O(n)
//static void moveAllX(String str,int idx,int count,String newString){
//    if(idx==str.length()){
//        for(int i=0;i<count;i++){
//            newString+='x';
//        }
//        System.out.println(newString);
//        return;
//    }
//    char currChar=str.charAt(idx);
//    if(currChar=='x'){
//        count++;
//        moveAllX(str,idx+1,count,newString);
//    }
//    else {
//        newString+=currChar;
//        moveAllX(str,idx+1,count,newString);
//    }
//}
//public static void main(String[] args) {
//    String str="axbcxxd";
//    moveAllX(str,0,0,"");
//}