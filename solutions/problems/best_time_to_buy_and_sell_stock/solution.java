class Solution {
    public int maxProfit(int[] prices) {
        int min=prices[0];
        int maxProfit=-1;
        for(int i = 0 ; i< prices.length;i++)
        {
            if(min>prices[i])
            {
                min=prices[i];
            }

            int profit = prices[i]-min;

            if(maxProfit<profit)
            {
                maxProfit=profit;
            }
        }
        return maxProfit;
    }
}