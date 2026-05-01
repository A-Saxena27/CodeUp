class Solution {
    public int lengthOfLastWord(String s) {
        int i=s.length()-1;
        while(s.charAt(i) == ' ')
        i--;
        if(i==0)
        return 1;
        int c=0;
        while(i>=0 && s.charAt(i) != ' ')
            {
                c++;
                i--;
            }
        return c;
    }
}