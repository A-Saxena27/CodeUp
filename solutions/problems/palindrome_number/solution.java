class Solution {
    public boolean isPalindrome(int x) {
        int d,s=0;
        int n=x;
        if(x<0)
        return false;
        while(n!=0)
        {
            d=n%10;
            s=s*10+d;
            n=n/10;
        }
        if(s==x)
        return true;
        else
        return false;
    }
}