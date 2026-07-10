class Solution {
    public double myPow(double x, int n) {
        double num=x;
        double pow=1;
        while(n!=0)
        {
        if(n%2==0)
        {
            x=x*x;
            n/=2;
        }
        else
        {
            if(n>0)
            {
            pow*=x;
            n--;
            }
            else
            {
                pow/=x;
                n++;
            }
        }
        }
        return pow;
    }
}