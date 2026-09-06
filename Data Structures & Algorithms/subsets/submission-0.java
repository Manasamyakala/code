class Solution {
    public List<List<Integer>> subsets(int[] nums) 
    {
        List<List<Integer>> ls=new ArrayList<>();
        find(nums,ls,new ArrayList<>(),0);
        return ls;
    }
    public static void find(int a[],List<List<Integer>> ls,List<Integer> r,int idx)
    {
        if(idx==a.length)
        {
            ls.add(new ArrayList<>(r));
            return;
        }
        r.add(a[idx]);
        find(a,ls,r,idx+1);
        r.remove(r.size()-1);
        find(a,ls,r,idx+1);
    }
}
