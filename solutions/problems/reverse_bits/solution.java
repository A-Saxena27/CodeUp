class Solution {
    public int reverseBits(int n) {
        int bin=0;
        int c;
        for(int i=0;i<32;i++)
        {
            c=n & 1;
            bin= (bin<<1)+c;
            n>>=1;
        }
        return bin;
    }
}