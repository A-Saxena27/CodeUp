class Solution {
    public int findNumbers(int[] nums) {
        int c=0,b=0;
        for(int num: nums)
        {
            int n=num;
            while(n!=0)
            {
                n=n/10;
                c++;
            }
            if(c%2==0)
            b++;
            c=0;
        }
        return b;
    }
}