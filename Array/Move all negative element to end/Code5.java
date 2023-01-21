//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
	        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            int a[] = new int[(int)(n)];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(inputLine[i]);
            }
            
            Solution obj = new Solution();
            obj.segregateElements(a, n);
            
            for(int i=0;i<n;i++)
            System.out.print(a[i]+" ");
            
            System.out.println();
        }
	}
}

// } Driver Code Ends


//User function Template for Java

class Solution {
    
    public void segregateElements(int arr[], int n)
    {
        // Your code goes here
        int [] a = new int[n];
        int j=0;
        for(int i=0; i<n; i++)
        {
            if(arr[i]>0)
            {
                a[j]=arr[i];
                j++;
            }
        }
        for(int i=0; i<n; i++)
        {
            if(arr[i]<0)
            {
                a[j]=arr[i];
                j++;
            }
        }
        for(int i=0; i<n; i++)
        {
            arr[i]=a[i];
        }
    }
}

/*

#TEST CASE 1:
For Input: 
8
1 -1 3 2 -7 -5 11 6
Your Output: 
1 3 2 11 6 -1 -7 -5
Expected Output: 
1 3 2 11 6 -1 -7 -5

#TEST CASE 2:
For Input: 
18
1 -1 3 1 -11 36 42 -17 -75 11 6 2 -7 -5 11 6 -5 11
Your Output: 
1 3 1 36 42 11 6 2 11 6 11 -1 -11 -17 -75 -7 -5 -5
Expected Output: 
1 3 1 36 42 11 6 2 11 6 11 -1 -11 -17 -75 -7 -5 -5

#TEST CASE 3:
For Input: 
20
21 33 -1 3 5 1 -11 36 42 -17 -75 11 6 2 -7 -5 11 6 -5 11
Your Output: 
21 33 3 5 1 36 42 11 6 2 11 6 11 -1 -11 -17 -75 -7 -5 -5
Expected Output: 
21 33 3 5 1 36 42 11 6 2 11 6 11 -1 -11 -17 -75 -7 -5 -5

*/
