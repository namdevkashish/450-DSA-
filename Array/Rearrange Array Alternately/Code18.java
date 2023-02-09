//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
	public static void main (String[] args)throws IOException
	{

// 		Scanner in = new Scanner(System.in);
        
// 		int t = in.nextInt();
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        
         //testcases
        int t = Integer.parseInt(read.readLine());
		
		while(t-- >0)
		{
		    //size of array
		    int n = Integer.parseInt(read.readLine());
		    long[] arr= new long[n];
		    
		    String str[] = read.readLine().trim().split(" ");
		    
		    //adding elements to the array
		    for(int i=0;i<n;i++)
		        arr[i] = Long.parseLong(str[i]);
		    
		    // StringBuffer sb = new StringBuffer();
		    
		    Solution ob = new Solution();
		    
		    //calling rearrange() function
		    ob.rearrange(arr, n);
		    StringBuffer sb = new StringBuffer();
		    
		    //appending and printing the elements
		    for(int i =0; i < n; i++)
		     sb.append(arr[i] + " ");
		    System.out.println(sb);
		}
	}
}

// } Driver Code Ends

class Solution{
    // temp: input array
    // n: size of array
    //Function to rearrange  the array elements alternately.
  
    public static void rearrange(long arr[], int n){
        // Your code here
        ArrayList<Long> aa = new ArrayList<>();
        int i=0;
        int j=n-1;
      
        while(i<=j){
            aa.add(arr[j]);
            aa.add(arr[i]);
            i++;
            j--;
        }
      
        for(int k=0;k<aa.size();k++){
            arr[k]=aa.get(k);
        }
    } 
}

/*
#TEST CASE 1:
For Input: 
6
1 2 3 4 5 6
Your Output: 
6 1 5 2 4 3
Expected Output: 
6 1 5 2 4 3

*/
