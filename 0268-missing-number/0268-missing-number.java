class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int sum=0;
        int actual=n*(n+1)/2;
        for(int i=0;i<n;i++)
        {
            sum+=nums[i];
        }
        int result=actual-sum;
        return result;
    }
}