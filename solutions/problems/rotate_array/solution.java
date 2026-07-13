class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k%=n;
        int j=0;
        int arr[]=new int[n];
        for(int i=n-k;j<k;i++)
        {
            arr[j]=nums[i];
            j++;
        }
        for(int i=0;j<n;i++)
        {
            arr[j]=nums[i];
            j++;
        }
        for(int i=0;i<n;i++)
        {
            nums[i]=arr[i];
        }

    }
}