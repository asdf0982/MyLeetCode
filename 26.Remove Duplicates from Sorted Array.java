class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length < 2) return nums.length;
        int j = 0;
        for(int i = 0; i< nums.length;i++){
            if (nums[i]!=nums[j])
                nums[++j] = nums[i];
        }
        return ++j;
    }
}