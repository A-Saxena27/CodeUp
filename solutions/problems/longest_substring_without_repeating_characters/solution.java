class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set=new HashSet<>();
        int first=0;
        int maxLen=-99;
        if(s.length()==0)
        return 0;
        for(int last=0;last<s.length();last++)
        {
            while(set.contains(s.charAt(last)))
            {
                set.remove(s.charAt(first));
                first++;
            }
            set.add(s.charAt(last));
            maxLen=Math.max(maxLen,last-first+1);
        }
        return maxLen;
    }
}