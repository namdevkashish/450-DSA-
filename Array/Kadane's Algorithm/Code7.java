//{ Driver Code Starts
import java.io.*;

class Main {
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
		    //size of array
		    int n = Integer.parseInt(br.readLine().trim());
		    int arr[] = new int[n];
		    String inputLine[] = br.readLine().trim().split(" ");
		    
		    //adding elements
		    for(int i=0; i<n; i++){
		        arr[i] = Integer.parseInt(inputLine[i]);
		    }
		    
		    Solution obj = new Solution();
		    
		    //calling maxSubarraySum() function
		    System.out.println(obj.maxSubarraySum(arr, n));
		}
	}
}


// } Driver Code Ends


class Solution{
     
    // arr: input array
    // n: size of array
    //Function to find the sum of contiguous subarray with maximum sum.
    long maxSubarraySum(int arr[], int n){
        
        // Your code here
        int sum=0;
        int ms=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
            if(ms<sum){
                ms=sum;
            }
            if(sum<0){
               sum=0;
           }
        }
      return ms;
      
    }
    
}

/*

#TEST CASE 1:
For Input: 
5
1 2 3 -2 5
Your Output: 
9
Expected Output: 
9

#TEST CASE 2:
For Input: 
10
41 12 23 -54 23 78 -234 -2 27 -2
Your Output: 
123
Expected Output: 
123

#TEST CASE 3:
For Input: 
50
41 12 23 -54 23 78 -234 -2 27 -2 1 11 3 2 5 3 76 -23 65 12 645 213 54 -323 553 24 65 -343 354 778 34 5 -354 67 346 734 6 -34 5 3 4 546 53 5 344 -234 23 57 34 888
Your Output: 
4732
Expected Output: 
4732

*/
