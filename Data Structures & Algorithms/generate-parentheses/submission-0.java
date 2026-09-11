class Solution {
    public List<String> generateParenthesis(int n) 
    {
        List<String> ls=new ArrayList<>();
        find(n,ls,0,0,"");
        return ls;
    }
    public static void find(int n,List<String> ls,int o,int c,String p)
    {
        if(2*n==p.length())
        {
            ls.add(p);
            return;
        }
        if(o<n) find(n,ls,o+1,c,p+'(');
        if(c<o) find(n,ls,o,c+1,p+')');
    }
}
