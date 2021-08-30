class Solution {
    public int firstUniqChar(String s) {
        int i =-1;
        int j =-1;
        int index =-1;
        char ch;
        HashMap<Character,Integer> map = new HashMap<>();
        while(i<s.length()-1)
        {
            i++;
            ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch,0)+1);
        }
        while(j<s.length()-1)
        {
            j++;
            ch = s.charAt(j);
            if(map.get(ch)==1)
            {
                index = j;
                return index;
            }
        }
        return index;
        
    }
}