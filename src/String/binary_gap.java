package String;
// binary gap within a positive integer N is any maximal sequence of consecutive zeros
// that is surrounded by ones at both ends in the binary representation of N.
public class binary_gap {
    static int binaryGap(int num){
        String binary=Integer.toBinaryString(num); // Number convert to binary 1000010001
        int longestGap=0;
        int currentGap=0;
        for(int i=0;i<binary.length();i++){
            if(binary.charAt(i)=='1'){
                if(currentGap>longestGap){ // 2nd time 1 caught at that time 4>0, 3rd time 1 caught at that time 3>4
                    longestGap=currentGap; // Now longestGap becomes 4
                }
                currentGap=0; // reset to 0 bcoz currentGap is not greater than longestGap otherwise it returns 4+3=7
            }
            else {
                currentGap++;
            }
        }
        return longestGap;
    }
    public static void main(String[] args) {
        int num=529; // representation : 1000010001 and gap: 2
        System.out.println(binaryGap(num));
    }
}
