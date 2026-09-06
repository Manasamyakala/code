class Solution {
    public int lengthOfLongestSubstring(String s) 
    {
        int l=0;
        int n=s.length();
        int max=0;
        HashSet<Character> hs=new HashSet<>();
        for(int i=0;i<n;i++)
        {
            while(hs.contains(s.charAt(i)))
            {
                hs.remove(s.charAt(l));
                l++;
            }
            hs.add(s.charAt(i));
            max=Math.max(max,i-l+1);
        }
        return max;
        
    }
}
