class Solution {
    public int maxAreaOfIsland(int[][] grid) 
    {
        int n=grid.length;
        int m=grid[0].length;
        int max=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(grid[i][j]==1)
                {
                   max=Math.max(max,dfs(grid,i,j));
                }
            }
        }
        return max;
    }
    public static int dfs(int grid[][],int i,int j)
    {
        if(i<0 || j<0|| i>=grid.length||j>=grid[0].length|| grid[i][j]!=1)
        {
            return 0;
        }
        grid[i][j]=0;
        int l=dfs(grid,i+1,j);
        int lt=dfs(grid,i-1,j);
        int r=dfs(grid,i,j-1);
        int rf=dfs(grid,i,j+1);

        return 1+l+lt+r+rf;
        
    }
}
