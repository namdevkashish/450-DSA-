//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0)
        {
            StringTokenizer stt = new StringTokenizer(br.readLine());
            
            int n = Integer.parseInt(stt.nextToken());
            int m = Integer.parseInt(stt.nextToken());
            // int n = Integer.parseInt(br.readLine().trim());
            int a[] = new int[n];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(inputLine[i]);
            }
            
            Solution obj = new Solution();
            System.out.println(obj.smallestSubWithSum(a, n, m));
        }
	}
}


// } Driver Code Ends


//User function Template for Java


class Solution {

    public static int smallestSubWithSum(int a[], int n, int x) {
        // Your code goes here 
         int i=0;

        int j=0;

        int minsize=Integer.MAX_VALUE;

        int sum=0;

        while(i<n){

            sum+=a[i];

            i++;

            while(sum>x){

                minsize=Math.min(minsize,i-j);

                sum-=a[j];

                j++;

            }

        }

        return minsize==Integer.MAX_VALUE?0:minsize;
    }
}

/*
#TEST CASE 1:
For Input: 
6 51
1 4 45 6 0 19
Your Output: 
3
Expected Output: 
3

*/
