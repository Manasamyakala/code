class Solution {
    public int[] countBits(int n) 
    {
        int r[]=new int[n+1];
        int cnt=0;
        for(int i=0;i<=n;i++)
        {
            int c=i;
            cnt=0;
            while(c>0)
            {
                cnt++;
                c=c&(c-1);
            }
            r[i]=cnt;
        }
        return r;
        
    }
}
