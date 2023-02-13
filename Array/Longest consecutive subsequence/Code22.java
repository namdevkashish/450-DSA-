//{ Driver Code Starts
//Initial Template for Java

import java.math.*;
import java.util.*;
import java.io.*;

class Driverclass
{
    // Driver Code
    static class FastReader{ 
        BufferedReader br; 
        StringTokenizer st; 
  
        public FastReader(){ 
            br = new BufferedReader(new InputStreamReader(System.in)); 
        } 
  
        String next(){ 
            while (st == null || !st.hasMoreElements()){ 
                try{ st = new StringTokenizer(br.readLine()); } catch (IOException  e){ e.printStackTrace(); } 
            } 
            return st.nextToken(); 
        } 
  
        String nextLine(){ 
            String str = ""; 
            try{ str = br.readLine(); } catch (IOException e) { e.printStackTrace(); } 
            return str; 
        } 

        Integer nextInt(){
            return Integer.parseInt(next());
        }
    }
    
	public static void main(String args[])
	{
		FastReader sc = new FastReader();
		PrintWriter out = new PrintWriter(System.out);
		int t = sc.nextInt();
		
		while(t>0)
		{
			int n = sc.nextInt();
			int a[] = new int[n];
			
			for(int i=0; i<n; i++)
				a[i] = sc.nextInt();
		    out.println(new Solution().findLongestConseqSubseq(a, n));
		    t--;
		}
		out.flush();
	}
}
// } Driver Code Ends


//User function Template for Java

class Solution
{   
    // arr[] : the input array
    // N : size of the array arr[]
    
    //Function to return length of longest subsequence of consecutive integers.
	static int findLongestConseqSubseq(int arr[], int N)
	{
	   // add your code here
	   int[] arr2 = new int[1000001];
	   int count=0;
	   int maximum=-1;
	   int max=Integer.MIN_VALUE;
	   for(int i=0;i<N;i++) {
	       arr2[arr[i]]++;
	       maximum=Math.max(maximum, arr[i]);
	   }
	   for(int i=0;i<=maximum;i++) {
	       if (arr2[i]>=1) {
	           count++;
	        }
	       else {
	           max = Math.max(max, count);
	           count=0;
	        }
	        max = Math.max(max, count);
	   }
	   return max;
	}
}

/*
#TEST CASE 1:
For Input: 
7
2 6 1 9 4 5 3
Your Output: 
6
Expected Output: 
6

*/
