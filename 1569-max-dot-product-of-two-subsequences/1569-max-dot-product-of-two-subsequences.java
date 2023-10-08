class Solution {

    public int f(int row, int col, int[][] m, int[][] dp){
        if(row>=m.length || col>=m[0].length) return 0;
        if(dp[row][col]!=-1) return dp[row][col];
        int max1 = 0;
        for(int i=row;i<m.length;i++){
            max1 = Math.max(max1,f(i+1,col+1,m,dp)+m[i][col]);
        }
        max1 = Math.max(max1,f(row+1,col,m,dp));
        int max2 = 0;
        for(int j=col;j<m[0].length;j++){
            max2 = Math.max(max1,f(row+1,j+1,m,dp)+m[row][j]);
        }
        max2 = Math.max(max2,f(row,col+1,m,dp));
        return dp[row][col] = Math.max(max1,max2);
    }

    public int maxDotProduct(int[] nums1, int[] nums2) {

        int[][] m = new int[nums1.length][nums2.length];

        int[][] dp = new int[m.length][m[0].length];
        for(int[] it : dp){
            Arrays.fill(it,-1);
        }

        int max = Integer.MIN_VALUE;

        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                m[i][j] = nums1[i]*nums2[j];
                if(m[i][j]>max) max = m[i][j];
            }
        }

        int ans = f(0,0,m,dp);

        if(max<=0) return max;
        return ans;
        
    }
}