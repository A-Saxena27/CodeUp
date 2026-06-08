class Solution {
    public int[] buildArray(int[] nums) {
        int ans[]=new int[nums.length];
        int n=0;
        for(int num:nums)
        {
            n=nums[num];
            ans[num]=nums[n];     
        }
        return ans;
    }
}