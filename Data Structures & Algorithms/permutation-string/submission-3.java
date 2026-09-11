class Solution {
    public boolean checkInclusion(String s1, String s2) 
    {
       char c[]=s1.toCharArray();
       Arrays.sort(c);
       int n=c.length;
       if(n>s2.length()) return false;
       for(int i=0;i<=s2.length()-n;i++)
       {
           String sub=s2.substring(i,i+n);
           char[] d=sub.toCharArray();
            Arrays.sort(d);
           if(Arrays.equals(d,c)) return true;
       }
       return false;
        
    }
}
