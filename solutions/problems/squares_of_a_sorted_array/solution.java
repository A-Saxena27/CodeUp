class Solution {
    public int[] sortedSquares(int[] nums) {
        for(int i=0;i<nums.length;i++)
        {
            nums[i]=nums[i]*nums[i];
        }
        int i=0;
        int j=nums.length-1;
        int k=nums.length-1;
        int numbers[]=new int[k+1];
        while(k>=0)
        {
            if(nums[i]>=nums[j])
            {
                numbers[k--]=nums[i++];
            }
            else
            {
            numbers[k--]=nums[j--];
            }
        }
        return numbers;

    }
}