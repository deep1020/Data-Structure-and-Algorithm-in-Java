package String;

public class find_first_last_occurance_string {
    static void findOccurance(String str, char target){
        int firstIndex=str.indexOf(target);
        int lastIndex=str.lastIndexOf(target);
        System.out.println(firstIndex+","+lastIndex);
    }
    public static void main(String[] args) {
        String str = "baacdaefaah";
        char target = 'a';
        findOccurance(str, target);
    }
//        int result[]=findOccurance(str,target);
//        if(result[0]!=1 && result[1]!=-1){
//            System.out.println("First occurrence of " + target + " at index: " + result[0]);
//            System.out.println("Last occurrence of " + target + "' at index: " + result[1]);
//        }

}
//static int[] findOccurance(String str, String target){
//    if(str.contains(target)){
//        int firstIndex=str.indexOf(target);
//        int lastIndex=str.lastIndexOf(target);
//        return new int[]{firstIndex,lastIndex};
//    }
//    return new int[]{-1,-1}; // -1 -1 will be returned by default if there is no target found in string
//}
//public static void main(String[] args) {
//    String str = "baacdaefaah";
//    String target = "a";
//    int result[] = findOccurance(str, target);
//    for (int i = 0; i < result.length; i++) {
//        System.out.println(result[i]);
//    }
//}