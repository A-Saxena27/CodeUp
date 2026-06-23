class Solution {
    public boolean isHappy(int n) {
        int slow=n;
        int fast=getSum(n);
        while(fast!=1 && fast!=slow)
        {
            slow=getSum(slow);
            fast=getSum(getSum(fast));
        }
        if(fast==1)
        return true;
        else
        return false;
    }
    private int getSum(int n){
        int sum=0;
        while(n>0)
            {
                int d=n%10;
                sum +=(d*d);
                n/=10;
            }
            return sum;

    }
}
 