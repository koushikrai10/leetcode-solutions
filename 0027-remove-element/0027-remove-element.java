class Solution {
    public int removeElement(int[] nums, int val) {
        int insertion=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=val)
            {
                nums[insertion]=nums[i];
                insertion++;
            }
        }
        return insertion;
    }
}