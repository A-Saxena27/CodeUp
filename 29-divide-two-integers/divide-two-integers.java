class Solution {
    public int divide(int dividend, int divisor) {
        if(divisor==dividend)
        return 1;
        int cn;
        boolean sign=true;
        if(dividend>=0 && divisor<0)
        sign=false;
        if(dividend<0 && divisor>0)
        sign=false;
        
        long ans=0;
        long n=Math.abs((long)dividend);
        long d=Math.abs((long)divisor);
        while(n>=d)
        {
            cn=0;
            while(n>=(d<<(cn+1)))
            cn++;

            ans+=(1<<cn);
            n=n-(d<<cn);
        }

        if(ans==(1<<31) && sign==true) return Integer.MAX_VALUE;
        if(ans==(1<<31) && sign==false) return Integer.MIN_VALUE;

        return (int)(sign?ans:(-ans));
    }
}