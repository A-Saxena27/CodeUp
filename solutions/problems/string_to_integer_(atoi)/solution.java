class Solution {
    public int myAtoi(String s) {
        int n=s.length();
        int sign=1;
        int i=0;
        long number=0;
        while(i<n && s.charAt(i)==' ')
        {
            i++;
        }
        if(i<n && s.charAt(i)=='+')
        {
            i++;
        }
        else if(i<n && s.charAt(i)=='-')
        {
            sign=-1;
            i++;
        }
        while(i<n && Character.isDigit(s.charAt(i)))
        {
            int digit=s.charAt(i)-'0';
            number= number * 10 + digit;
            if((sign*number)>Integer.MAX_VALUE)
            return 2147483647;
            if((sign*number)<Integer.MIN_VALUE)
            return -2147483648;
            i++;
        }
        return (sign)*(int)(number);
    }
}