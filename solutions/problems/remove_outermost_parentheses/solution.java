class Solution {
    public String removeOuterParentheses(String s) {
        String str=""; int flag=0;
        
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(')
            {
                if(flag>0)
                str=str+s.charAt(i);
                flag++;
            }
            
            if(s.charAt(i)==')')
            {
                flag--;
                if(flag>0)
                str=str+s.charAt(i);
            }
        }
        return str;
    }
}