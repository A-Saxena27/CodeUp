class Solution {
    public char findTheDifference(String s, String t) {
        char a=0;
        for(char ch: s.toCharArray()){
            a^=ch;
        }
        for(char ch:t.toCharArray()){
            a^=ch;
        }    
        return a;
    }
}