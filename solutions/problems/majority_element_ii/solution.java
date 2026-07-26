class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list=new ArrayList<>();
        int n=nums.length;
        if(n<2)
        {
        list.add(nums[0]);
        return list;
        }
        int cn1=0,cn2=0;
        int el1=-99, el2=-88;
        for(int i=0;i<n;i++)
        {
            if(el2!=nums[i]&&cn1==0)
            {
                el1=nums[i];
                cn1=1;
            }
            else if(el1!=nums[i]&&cn2==0)
            {
                el2=nums[i];
                cn2=1;
            }
            else if(el1==nums[i])
            cn1++;
            else if(el2==nums[i])
            cn2++;
            else
            {
                cn1--;
                cn2--;
            }
        }
        int c1=0,c2=0;
        for(int num:nums)
        {
            if(num==el1)
            c1++;
            if(num==el2)
            c2++;
        }
        if(c1>(n/3))
        list.add(el1);
        if(c2>(n/3) && el1!=el2)
        list.add(el2);

        return list;
    }
}