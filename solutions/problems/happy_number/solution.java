class Solution {
    public boolean isHappy(int n) {
        int x=n;
        int d,s=0;
        while(x!=0)
        {
            d=x%10;
            s+=(d*d);
            x=x/10;
        }
        if(s>=5)
        return isHappy(s);
        else if(s==1)
        return true;
        else
        return false;
    }
}