class Solution {
    public int findMin(int[] nums) {
        int min=99;
        for(int num:nums)
        {
            if(min>num)
            {
                min=num;
            }
        }
        return min;
    }
}