class Solution {
    public int numIslands(char[][] grid) 
    {
        int n=grid.length;
        int m=grid[0].length;
        int cnt=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(grid[i][j]=='1')
                {
                    dfs(grid,i,j);
                    cnt++;
                }
            }
        }
        return cnt;
    }
    public static void dfs(char g[][],int i,int j)
    {
        if(i<0 || j<0 || i>=g.length||j>=g[0].length || g[i][j]!='1')
        {
            return;
        }
         g[i][j]='0';
        dfs(g,i+1,j);
        dfs(g,i-1,j);
        dfs(g,i,j+1);
        dfs(g,i,j-1);
    }
}
