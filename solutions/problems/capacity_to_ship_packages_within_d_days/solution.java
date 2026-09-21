class Solution {
    private int daysCalc(int[] weights, int capacity)
    {
        int days=1;
        int currLoad=0;
        for(int weight:weights)
        {
            if(currLoad+weight>capacity)
            {
                days++;
                currLoad=weight;
            }
            else
            {
                currLoad+=weight;
            }
        }
        return days;
    }
    public int shipWithinDays(int[] weights, int days) {
        int low=0;
        int high=0;

        int answer=high;
        for(int weight:weights)
        {
            low=Math.max(weight,low);
            high+=weight;
        }

        while(low<=high)
        {
            int mid=(low+high)/2;
            if(daysCalc(weights, mid)<=days)
            {
                answer=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return answer;
    }
}