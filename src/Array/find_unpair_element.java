package Array;

public class find_unpair_element {
    static int unpairElement(int nums[]){
        int result = 0; // Initialize the result to 0
        for (int num : nums) {
            // XOR operation cancels out paired elements, leaving the unpaired element
            result ^= num;
        }
        return result;
    }
    public static void main(String[] args) {
        int nums[]={9, 3, 9, 3, 9, 7, 9};
        System.out.println(unpairElement(nums));
    }
}
