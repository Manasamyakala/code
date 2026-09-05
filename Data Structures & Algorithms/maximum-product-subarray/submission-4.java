class Solution {
    public int maxProduct(int[] nums) 
    {
        int n=nums.length;
        int max=nums[0];
        int min=nums[0];
        int ans=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            int x=nums[i];
            int tmax=Math.max(x,Math.max(max*x,min*x));
            int tmin=Math.min(x,Math.min(max*x,min*x));
            max=tmax;
            min=tmin;
            ans=Math.max(ans,max);
        }
        return ans;
    }
}
