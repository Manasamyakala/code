class Solution {
    public int missingNumber(int[] nums) 
    {
        HashSet<Integer> hs=new HashSet<>();
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            hs.add(nums[i]);
            max=Math.max(max,nums[i]);
        }
        for(int i=0;i<nums.length;i++)
        {
            if(!hs.contains(i)) return i;
        }
        return max+1;
        
    }
}
