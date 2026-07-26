class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        int cn=0;
        int el=0;
        for(int i=0;i<n;i++)
        {
            if(cn==0)
            {
                el=nums[i];
                cn++;
            }
            else if(el==nums[i])
            cn++;
            else
            cn--;
        }
        int cn1=0;
        for(int num:nums){
            if(num==el)
            cn1++;
        }
        if(cn1>(n/2))
        return el;

        return -1;
        }
}