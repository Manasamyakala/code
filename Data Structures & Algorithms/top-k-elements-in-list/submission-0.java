class Solution {
    public int[] topKFrequent(int[] nums, int k) 
    {
        HashMap<Integer,Integer> hs=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            hs.put(nums[i],hs.getOrDefault(nums[i],0)+1);
        }
        List<Map.Entry<Integer,Integer>> ls=new ArrayList<>(hs.entrySet());
        ls.sort((x,y)->y.getValue()-x.getValue());   
        int r[]=new int[k];     
        for(int i=0;i<k;i++)
        {
            r[i]=ls.get(i).getKey();
        }
        return r;
    }
}
