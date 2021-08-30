class Solution {
    public boolean isAnagram(String s, String t) 
    {
        String s1 = s.replaceAll("\\s", "");  
        String s2 = t.replaceAll("\\s", "");  
        boolean status = true;  
        if (s1.length() != s2.length()) 
        {  
            status = false;  
        } 
        else 
        {  
            char[] ArrayS1 = s1.toLowerCase().toCharArray();  
            char[] ArrayS2 = s2.toLowerCase().toCharArray();  
            Arrays.sort(ArrayS1);  
            Arrays.sort(ArrayS2);  
            status = Arrays.equals(ArrayS1, ArrayS2);  
        }
        return status;
        
    }
}