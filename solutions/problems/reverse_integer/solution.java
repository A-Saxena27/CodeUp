class Solution {
    public int reverse(int x) {
        int d=0;
        long revNum=0;
        while(x!=0)
        {
            d=x%10;
            if((revNum==Integer.MAX_VALUE && d>0)||(revNum<Integer.MIN_VALUE && d>0))
            return 0;
            revNum=revNum*10+d;
            if(revNum>=Integer.MAX_VALUE||revNum<Integer.MIN_VALUE)
            return 0;
            x/=10;
        }
        return (int)revNum;
    }
}