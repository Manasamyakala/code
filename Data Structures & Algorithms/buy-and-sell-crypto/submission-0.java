class Solution {
    public int maxProfit(int[] prices) 
    {
        int min=Integer.MAX_VALUE;
        int p=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<prices.length;i++)
        {
            min=Math.min(min,prices[i]);
            p=prices[i]-min;
            max=Math.max(p,max);
        }
        return max;
        
    }
}
