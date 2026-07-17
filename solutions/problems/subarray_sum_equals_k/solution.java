class Solution {
    public int subarraySum(int[] nums, int k) {
        int prefixsum=0;
        int count=0;
        HashMap<Integer,Integer> sumFreq=new HashMap<>();
        sumFreq.put(0,1);

        for(int num:nums)
        {
            prefixsum+=num;
            if(sumFreq.containsKey(prefixsum-k)){
                count+=sumFreq.get(prefixsum-k);
            }
            sumFreq.put(prefixsum, sumFreq.getOrDefault(prefixsum,0)+1);
        }
        return count;
    }
}