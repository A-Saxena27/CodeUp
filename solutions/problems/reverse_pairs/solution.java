class Solution {
        public int mergeSort(int nums[], int l,int m,int h){
        int j=m+1;
        int k=0;
        int cnt=0;
        int temp[]=new int[h-l+1];

        for (int i = l; i <= m; i++) {

            while (j <= h && nums[i] > 2L * nums[j]) {
                j++;
            }

            cnt += j - (m + 1);
        }
        int i=l;
        j=m+1;
        while(i<=m&& j<=h)
        {
            if(nums[i]<=nums[j])
            temp[k++]=nums[i++];
            else
            {
                temp[k++]=nums[j++];
            }
        }
        while(i<=m)
        {
            temp[k++]=nums[i++];
        }
        while(j<=h)
        {
            temp[k++]=nums[j++];
        }
        for(int x = 0; x < temp.length; x++)
        {
            nums[l + x] = temp[x];
        }
        return cnt;
    }
        public int merge(int nums[],int low, int high)
    {
        int cn=0;
        if(low>=high)
        return 0;
        else
        {
            int mid=(high+low)/2;
            cn+=merge(nums, low, mid);
            cn+=merge(nums,mid+1, high);
            cn+=mergeSort(nums,low,mid,high);
        }
        return cn;
    }
    public int reversePairs(int[] nums) {
        int low=0;
        int high=nums.length-1;
        int cn=merge(nums,low,high);
        return cn;
    }
}