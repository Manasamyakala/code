class Solution {
    public boolean exist(char[][] board, String word) 
    {
       int n=board.length;
       int m=board[0].length;
       for(int i=0;i<n;i++)
       {
        for(int j=0;j<m;j++)
        {
            if(dfs(board,i,j,word,0))
            {
                return true;
            }
        }
       }
       return false;
    }
    public static boolean dfs(char[][] b,int i,int j,String w,int idx)
    {
        if(idx==w.length())
        {
            return true;
        }
        if(i<0||j<0||i>=b.length||j>=b[0].length||w.charAt(idx)!=b[i][j])
        {
            return false;
        }
        char t=b[i][j];
        b[i][j]='#';
        boolean found=dfs(b,i+1,j,w,idx+1) || dfs(b,i-1,j,w,idx+1)||                          dfs(b,i,j+1,w,idx+1) || dfs(b,i,j-1,w,idx+1);
        b[i][j]=t;

        return found;
    }
}
