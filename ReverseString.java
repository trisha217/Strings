class Solution {
    public void reverseString(char[] s) {
        int n = s.length;
        int mid = n/2;
        char temp;
        int j,i;
        for(i =0, j =(n-1);i<mid;i++,j--)
        {
            temp = s[i];
            s[i] = s[j];
            s[j] = temp;         
        }
        for(i =0;i<n;i++)
        {
            System.out.print(s[i]);
        }
    }
}