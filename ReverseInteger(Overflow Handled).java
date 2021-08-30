class Solution {
    public int reverse(int x) {
        boolean negative = false;
        if(x<0)
        {
            negative = true;
            x = -1 * x;
        }
        int n = 0;
        int rem = 0;
        while(x>0)
        {
            int cur = x%10;
            n = n*10 + cur;
            if ((n - cur)/10 != rem)
            {
                return 0;
            }
            
            rem = n;
            x = x/10;
        }
        if(negative)
        {
            n = -1 * n;
        }
        return n;        
    }
}