import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		int t=sc.nextInt();
		
		while(t-->0)
		{
		    int n=sc.nextInt();
		    
		    int arr[]=new int[n];
		    
		    for(int i=0;i<n;i++)
		    arr[i]=sc.nextInt();
		    
		    int k=sc.nextInt();
		    Solution ob = new Solution();
		    out.println(ob.kthSmallest(arr, 0, n-1, k));
		}
		out.flush();
	}
}

// } Driver Code Ends


//User function Template for Java

class Solution{
    public static int kthSmallest(int[] arr, int l, int r, int k) 
    { 
        Arrays.sort(arr);
        return arr[k-1];
    } 
}

/*
#TEST CASE 1:
For Input: 
8
7 10 4 3 20 15 1 54
1
Your Output: 
1
Expected Output: 
1

#TEST CASE 2:
For Input: 
8
1 45 234 67 345 35 12 56
5
Your Output: 
56
Expected Output: 
56

#TEST CASE 3:
5
1 45 234 345 35 
3
Your Output: 
45
Expected Output: 
45
*/
