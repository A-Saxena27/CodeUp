class Solution {
    public int[] rearrangeArray(int[] nums) {
        int i=0;
        int n=nums.length;
        int arr[]=new int[n];
        int positive=0;
        int negative=1;
        while(i<n){
        if(nums[i]>=0)
        {
            arr[positive]=nums[i++];
            positive+=2;
        }
        else if(nums[i]<0)
        {
            arr[negative]=nums[i++];
            negative+=2;
        }
        }
        for(int j=0;j<n;j++)
        {
            nums[j]=arr[j];
        }
        return nums;
    }
}