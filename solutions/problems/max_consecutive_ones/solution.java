class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n=nums.length;
        int cn=0,maxcn=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            if(nums[i]!=1)
            cn=0;
            else
            cn++;
            if(maxcn<cn)
            maxcn=cn;
        }
        return maxcn;
    }
}