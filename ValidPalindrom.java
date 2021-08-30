class Solution {
    public boolean isPalindrome(String s1) 
    {
        String reverse = "";
        boolean status = false;
        int n = s1.length();
        String original = "";
        String s = s1.toLowerCase();
    
        for(int i = 0;i<n;i++)
        {
            if(Character.isLetterOrDigit(s.charAt(i)))
            {
                char c = s.charAt(i);
                original = original + c;
            }               
        }

        int len = original.length();
        for(int i =len-1;i>=0;i--)
        {
            if(Character.isLetterOrDigit(original.charAt(i)))
            {
                char ch = original.charAt(i);
                reverse = reverse + ch;
            }
        }

        if (original.equals(reverse))
        {
            status = true;
        }
        return status;
    }
}