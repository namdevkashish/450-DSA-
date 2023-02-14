//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader in =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while (t-- > 0) {
            int K = Integer.parseInt(in.readLine());
            int N = Integer.parseInt(in.readLine());
            String input_line[] = in.readLine().trim().split("\\s+");
            int A[] = new int[N];
            for (int i = 0; i < N; i++) A[i] = Integer.parseInt(input_line[i]);

            Solution ob = new Solution();
            System.out.println(ob.maxProfit(K, N, A));
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    static int maxProfit(int K, int N, int A[]) {
        // code here
        int[][][] dp= new int[N][K+1][2];
        for(int i=0;i<N;i++)
        {
            for(int j=0;j<=K;j++)
            {
                for(int x=0;x<2;x++)
                {
                    dp[i][j][x]=-1;
                }
            }
        }
        return fun(0,A,N,K,1,dp);
    }
    static int fun(int ind,int[] a, int n, int k, int buy,int[][][] dp)
    {
        if(ind==n || k==0)return 0;
        
        if(dp[ind][k][buy]!=-1)return dp[ind][k][buy];
        
        if(buy==1){
            return dp[ind][k][buy]=Math.max(-a[ind]+fun(ind+1,a,n,k,0,dp),0+fun(ind+1,a,n,k,1,dp));
        }
        else{
            return dp[ind][k][buy]=Math.max(a[ind]+fun(ind+1,a,n,k-1,1,dp),0+fun(ind+1,a,n,k,0,dp));
        }
    }
}

/*
#TEST CASE 1:
For Input: 
2
6
10 22 5 75 65 80
Your Output: 
87
Expected Output: 
87

*/
