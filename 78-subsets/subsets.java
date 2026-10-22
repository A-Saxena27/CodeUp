class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        int n=nums.length;
        int subsets=1<<n;
        for(int k=0;k<subsets;k++)
        {
            List<Integer> list=new ArrayList<>();
            for(int i=0;i<n;i++)
            {
                if((k & (1<<i))!=0)
                list.add(nums[i]);
            }
            ans.add(list);
        }
        return ans;
    }
}