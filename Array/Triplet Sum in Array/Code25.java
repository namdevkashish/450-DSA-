//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Main
{
    public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
		    String inputLine[] = br.readLine().trim().split(" ");
		    int n = Integer.parseInt(inputLine[0]);
		    int X = Integer.parseInt(inputLine[1]);
		    int A[] = new int[n];
		    inputLine = br.readLine().trim().split(" ");
		    for(int i=0; i<n; i++){
		        A[i] = Integer.parseInt(inputLine[i]);
		    }
		    Solution ob=new Solution();
		    boolean ans = ob.find3Numbers(A, n, X);
		    System.out.println(ans?1:0);
		}
	}
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    //Function to find if there exists a triplet in the 
    //array A[] which sums up to X.
    public static boolean find3Numbers(int A[], int n, int X) { 
    
    // step1 : sort the given array sort(A, A+n);
        for(int i=0; i<=n-3; i++){
            int tar = X - A[i];
    // step2 : now problem becomes to find the sum of two element equal to tar index goes from i+1 to n-1
            int lo = i+1;
            int hi = n-1;
            while(lo < hi){
                if(A[lo] + A[hi] == tar)
                    return true;
                else if(A[lo] + A[hi] > tar)
                    hi--;
                else
                    lo++;
            }
        }
        return false;
    }
}


/*
#TEST CASE 1:
For Input: 
6 13
1 4 45 6 10 8
Your Output: 
1
Expected Output: 
1

*/
