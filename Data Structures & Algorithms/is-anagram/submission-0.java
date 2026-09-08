class Solution {
    public boolean isAnagram(String s, String t) 
    {
        int n=s.length();
        int f[]=new int[26];
        if(s.length()!=t.length()) return false;
        for(int i=0;i<n;i++)
        {
            f[s.charAt(i)-'a']++;
            f[t.charAt(i)-'a']--;
        }
        for(int i:f)
        {
            if(i!=0) return false;
        }
        return true;

    }
}
