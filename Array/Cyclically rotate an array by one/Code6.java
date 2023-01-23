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
            int a[] = new int[n];
            // long getAnswer[] = new long[(int)(n)];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(inputLine[i]);
            }
            
            Compute obj = new Compute();
            obj.rotate(a, n);
            
            StringBuilder output = new StringBuilder();
            for(int i=0;i<n;i++)
                output.append(a[i]+" ");
            System.out.println(output);
            
        }
	}
}


// } Driver Code Ends


//User function Template for Java

class Compute {
    
    public void rotate(int arr[], int n)
    {
        int temp = arr[arr.length-1];
        for(int i=arr.length-2; i>=0; i--){
            arr[i+1]=arr[i];
        }
        arr[0]=temp;
    }
}


/*

#TEST CASE 1:
For Input: 
5
1 2 3 4 5
Your Output: 
5 1 2 3 4
Expected Output: 
5 1 2 3 4

#TEST CASE 2:
For Input: 
10
1 11 2 31 4 5 12 5 23 7
Your Output: 
7 1 11 2 31 4 5 12 5 23
Expected Output: 
7 1 11 2 31 4 5 12 5 23

#TEST CASE 3:
For Input: 
50
1 11 2 31 4 5 12 5 23 7 22 34 112 435 12 34 54 567 34 1 523 5423 3541 34 34 5 23 534 12334 23 51 45 23 34 45 45 5 5 5 6 56 5 6 5 4 4 45 45 45 54
Your Output: 
54 1 11 2 31 4 5 12 5 23 7 22 34 112 435 12 34 54 567 34 1 523 5423 3541 34 34 5 23 534 12334 23 51 45 23 34 45 45 5 5 5 6 56 5 6 5 4 4 45 45 45
Expected Output: 
54 1 11 2 31 4 5 12 5 23 7 22 34 112 435 12 34 54 567 34 1 523 5423 3541 34 34 5 23 534 12334 23 51 45 23 34 45 45 5 5 5 6 56 5 6 5 4 4 45 45 45

*/
