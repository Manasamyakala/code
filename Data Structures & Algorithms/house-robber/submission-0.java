class Solution {
    public int rob(int[] nums) 
    {
        int n=nums.length;
        int dp[]=new int[n];
        Arrays.fill(dp,-1);
        int r=find(nums,dp,n-1);
        return r;
    }
    public static int find(int a[],int dp[],int n)
    {
         if(n<0) return 0;
        if(dp[n]!=-1) return dp[n];
        int p=a[n]+find(a,dp,n-2);
        int np=find(a,dp,n-1);
        dp[n]=Math.max(p,np);
        return dp[n];
    }
}
