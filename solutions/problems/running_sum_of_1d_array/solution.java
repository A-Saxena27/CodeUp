class Solution {
    public int[] runningSum(int[] nums) {
        int sums=0;
        int runningSum[]=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
        sums+=nums[i];
        runningSum[i]=sums;
        }
        return runningSum;
    }
}