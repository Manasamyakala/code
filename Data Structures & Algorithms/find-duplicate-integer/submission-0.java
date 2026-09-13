class Solution {
    public int findDuplicate(int[] nums) 
    {
        HashSet<Integer> hs=new HashSet<>();
        int i=0;
        while(i<nums.length)
        {
            if(hs.contains(nums[i])){return nums[i]; }
            hs.add(nums[i]);
            i++;
        }
        return -1;
    }
}
