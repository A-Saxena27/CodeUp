class Solution {
    public boolean check(int[] nums) {
        int n=nums.length;
        int check=0;
        for(int i=1;i<n;i++)
        {
            if(nums[i-1]>nums[i])
            {
                check++;
            }

        }
        if(nums[0]<nums[n-1])
        check++;
        if(check>1)
        return false;

        return true;
    }
}