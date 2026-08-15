class Solution {
    public int[] searchRange(int[] nums, int target) {
        if(nums.length==0)
        return new int[]{-1,-1};
        if(nums.length<2 && nums[0]!=target)
        return new int[]{-1,-1};
        int first=firstFound(nums,target);
        int last=lastFound(nums,target);
        if(nums[first] != target && nums[last] !=target)
        return new int[]{-1,-1};
        return new int[]{first,last};
    }
    public int firstFound(int[] nums, int target){
        int low=0,high=nums.length-1;
        int ans=-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(nums[mid]>=target)
            {
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        if(ans==-1)
        return 0;
        return ans;
    }
    public int lastFound(int[] nums, int target){
        int low=0;
        int high=nums.length-1;
        int ans=-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(nums[mid]<=target)
            {
                ans=mid;
                low=mid+1;
            }
            else
            {
                high=mid-1;
            }
        }
        if(ans==-1)
        return 0;
        return ans;
    }

}