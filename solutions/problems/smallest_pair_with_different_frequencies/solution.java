class Solution {
    public int[] minDistinctFreqPair(int[] nums) {
        HashMap<Integer, Integer> freq=new HashMap<>();

        for(int i=0;i<nums.length;i++)
        {
            int num=nums[i];
            if(freq.containsKey(num))
            {
                freq.put(num, freq.get(num)+1);
            }
            else
            {
                freq.put(num,1);
            }
        }
        if(freq.size()<2)
        {
            return new int[]{-1,-1};
        }
        ArrayList<Integer> values= new ArrayList<>(freq.keySet());
        Collections.sort(values);
        for(int i=0;i<values.size();i++)
        {
            for(int j=i+1;j<values.size();j++)
            {
                int x=values.get(i);
                int y=values.get(j);
                if(freq.get(x)!=freq.get(y))
                return new int[]{x,y};
            }
        }
        return new int []{-1,-1};
    }
}