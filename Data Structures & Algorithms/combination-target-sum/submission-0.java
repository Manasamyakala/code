class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) 
    {
        List<List<Integer>> ls=new ArrayList<>();
        find(nums,target,ls,new ArrayList<>(),0);
        return ls;
    }
    public static void find(int a[],int t,List<List<Integer>> ls,List<Integer> tmp,int idx)
    {
        if(t==0)
        {
              ls.add(new ArrayList<>(tmp));
        }
        if(idx==a.length || t<0) return;
        for(int i=idx;i<a.length;i++)
        {
            tmp.add(a[i]);
            find(a,t-a[i],ls,tmp,i);
            tmp.remove(tmp.size()-1);
        }
    }
}
