class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int m=g.length;
        int n=s.length;
        if(n==0) return 0;
        Arrays.sort(g);
        Arrays.sort(s);
        int l=0,r=0;
        while(l<m && r<n)
        {
            if(g[l]<=s[r])
            {
            r++;
            l++;
            }
            else
            {
                r++;
            }
        }
        return l;
    }
}