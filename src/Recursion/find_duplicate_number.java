package Recursion;

public class find_duplicate_number {
    static int findDuplicate(int nums[],int cur){
        if(cur==nums[cur]){
            return cur;
        }
        int nxt=nums[cur];
        nums[cur]=cur;
        return findDuplicate(nums,nxt);
    }
    public static void main(String[] args) {
        int nums[]={1,3,2,4,2};
        System.out.println(findDuplicate(nums,0));
    }
}
// T.C -> O(n)
// S.C -> O(n)
