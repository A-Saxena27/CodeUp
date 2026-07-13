class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max=-99;
        int k=0;
        for(int i=0;i<piles.length;i++)
        {
            if(max<piles[i])
            max=piles[i];
        }
        int l=1, r=max;
        while(l<r)
        {
            k=(l+r)/2;
            if((canEat(k,piles))<=h)
            r=k;
            else
            l=k+1;
        }
        return r;
    }
    public int canEat(int k, int piles[])
    {
        int hours=0;
        for(int pile: piles)
            hours+=Math.ceil((double)pile/k);
        return hours;
    }
}