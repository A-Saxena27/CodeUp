class Solution {
    public int addDigits(int num) {
        if(num<10)
        return num;
        int n=num;
        int sum=0;
        while(n!=0 || sum>9)
        {
            if(n==0 && sum>=10)
            {n=sum;
            sum=0;}
            int d=n%10;
            sum+=d;
            n/=10;
        }
        return sum;
    }
}