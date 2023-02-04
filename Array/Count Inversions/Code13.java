//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Sorting
{
    public static void main (String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        
        while(t-- > 0)
        {
            long n = sc.nextLong();
            long arr[] = new long[(int)n];
            
            for(long i = 0; i < n; i++)
             arr[(int)i] = sc.nextLong();
             
            System.out.println(new Solution().inversionCount(arr, n));
            
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    // arr[]: Input Array
    // N : Size of the Array arr[]
    //Function to count inversions in the array.
    static long binSearch(long[] arr, long start, long end, long key) {
        long count = 0;
        long temp = 0;
        while(start <= end) {
            int mid = (int) (start + (end - start) / 2);
            
            if(arr[mid] < key) {
                if(temp != arr[mid]) {
                    count += 1;
                    temp = arr[mid];
                }
                end = mid-1;
            }
            else
                start = mid+1;
        }
        
        //System.out.println("for "+key+" count is "+count);
        
        return count;
    }
    static long inversionCount(long arr[], long N)
    {
        // Your Code Here
        int in = 1;
        while(in < (int)N && (arr[in] >= arr[in-1])) {
            in += 1;
        }
        
        if(in == ((int)N) + 1)
            return 0;
        
        else if(in == 1)
            return arr[0];
        
        /* We will try and build a suffix array to get the min elements sorted and then we apply BS for
        element. */
        
        int n = (int) N;
        
        long[] sArr = new long[n];
        long count = 0;
        
        sArr[n-1] = arr[n-1];
        
        for(int i=n-2;i>=0;i--) {
            sArr[i] = Math.min(sArr[i+1], arr[i]);
        }
        
        /*for(int i=0;i<n;i++) System.out.print(sArr[i]+" ");
        
        System.out.println();*/
        
        
        for(int i=0;i<n-1;i++) {
            count += binSearch(sArr,i+1,n-1,arr[i]);
        }
        
        return count;
    }
}

/*
#TEST CASE 1:
For Input: 
5
2 4 1 3 5
Your Output: 
3
Expected Output: 
3


*/
