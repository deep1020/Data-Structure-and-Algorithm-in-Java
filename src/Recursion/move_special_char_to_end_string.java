package Recursion;

public class move_special_char_to_end_string {

    static void moveSpecialChar(String str,int idx){
        if(idx==str.length()){
            return;
        }
        char currChar=str.charAt(idx);
        if(Character.isAlphabetic(currChar)){
            System.out.print(currChar);
        }
        moveSpecialChar(str,idx+1);
        if(!Character.isAlphabetic(currChar)){
            System.out.print(currChar);
        }
    }
    public static void main(String[] args) {
        String str="ax$@fg%(";
        moveSpecialChar(str,0);
    }
}
