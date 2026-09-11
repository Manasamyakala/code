class Solution {
    public List<List<Integer>> permute(int[] nums) 
    {
        List<List<Integer>> r=new ArrayList<>();
        find(nums,r,new ArrayList<>(),0);
        return r;
    }
    public static void find(int a[],List<List<Integer>> ls,List<Integer> r,int idx)
    {
        if(r.size()==a.length)
        {
            ls.add(new ArrayList<>(r));
            return;
        }
        for(int i=0;i<a.length;i++)
        {
            if(r.contains(a[i]))
            {
                continue;
            }
            r.add(a[i]);
            find(a,ls,r,i+1);
            r.remove(r.size()-1);
        }
    }
}
