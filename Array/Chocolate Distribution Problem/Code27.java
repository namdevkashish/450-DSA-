//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            ArrayList<Integer> arr = new ArrayList<>();
            for(int i = 0;i<n;i++)
                {
                    int x = sc.nextInt();
                    arr.add(x);
                }
            int m = sc.nextInt();
            
            Solution ob = new Solution();
            
    		System.out.println(ob.findMinDiff(arr,n,m));
        }
        
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public long findMinDiff (ArrayList<Integer> a, int n, int m)
    {
        // your code here
        Collections.sort(a);

        int min=Integer.MAX_VALUE;

        for(int i=0;i<=n-m;i++)

        {

            int b= a.get(i+m-1)-a.get(i);

            if(min>b)

            min=b;

        }

        return min;
    }
}

/*
#TEST CASE 1:
For Input: 
8
3 4 1 9 56 7 9 12
5
Your Output: 
6
Expected Output: 
6

*/
