package Array;

public class remove_duplicate_elements {
    public static int removeDuplicates(int[] nums) {
        int j = 1; // index of the last unique element
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] != nums[i+1]) { // found a new unique element
                nums[j] = nums[i+1]; // add it to the end of the unique elements
                j++;
            }
        }
        return j;
    }
    public static void main(String[] args) {
        int[] nums = {1,1,2};
        int dup = removeDuplicates(nums);
        System.out.println(dup); // output: 2
        for (int i = 0; i < dup; i++) {
            System.out.print(nums[i] + " "); // output: 1 2
        }
    }
}
