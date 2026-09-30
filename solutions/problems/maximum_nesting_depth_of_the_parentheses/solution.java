class Solution {
    public int maxDepth(String s) {
        int count=0,maxcn=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(')
            {
                count++;
                maxcn=Math.max(maxcn,count);
            }
            if(s.charAt(i)==')')
            {
                count--;
            }
        }
        return maxcn;
    }
}