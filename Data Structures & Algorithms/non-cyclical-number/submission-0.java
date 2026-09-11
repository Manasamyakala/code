class Solution {
    public boolean isHappy(int n) 
    {
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<n;i++)
        {
            hs.add(n);
             n=find(n);
        }
        return  n==1;
    }
    public static int find(int n)
    {
        int s=0;
        while(n>0)
        {
            int d=n%10;
            s+=d*d;
            n=n/10;
        }
        return s;
    }
}
