package Recursion;

public class find_first_last_occurance_string {
    static int first=-1;
    static int last=-1;
    static void findOccurance(String str,int idx,char element){
        if(idx==str.length()){
            System.out.println("First occurance of "+element+" is at index "+first);
            System.out.println("Last occurance of "+element+" is at index "+last);
            return;
        }
        char currChar=str.charAt(idx);
        if(currChar==element){
            if(first==-1){
                first=idx;
            }
            else {
                last=idx;
            }
        }
        findOccurance(str,idx+1,element);
    }
    public static void main(String[] args) {
        String str="baacdaefaah";
        char element='a';
        findOccurance(str,0,element);
    }
}
// T.C -> O(n) traverse elements from start to end in string
// S.C -> O(n)
