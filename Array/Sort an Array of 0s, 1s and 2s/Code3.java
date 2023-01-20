//{ Driver Code Starts
//Initial template for Java

import java.io.*;
import java.util.*;


// } Driver Code Ends
//User function template for Java

class Solution
{
    public static void sort012(int a[], int n)
    {
        int count0=0, count1=0, count2=0;
        for(int i=0; i<n; i++){
            if(a[i]==0){ count0++; }
            else if(a[i]==1){ count1++; }
            else if(a[i]==2){ count2++; }
        }
        int i=0;
        while(count0>0){
            a[i++]=0;
            count0--;
        }
        while(count1>0){
            a[i++]=1;
            count1--;
        }
        while(count2>0){
            a[i++]=2;
            count2--;
        }
    }
}

//{ Driver Code Starts.

class GFG {
    
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
        while(t-->0){
            int n = Integer.parseInt(br.readLine().trim());
            int arr[] = new int[n];
            String inputLine[] = br.readLine().trim().split(" ");
            for(int i=0; i<n; i++){
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            Solution ob=new Solution();
            ob.sort012(arr, n);
            StringBuffer str = new StringBuffer();
            for(int i=0; i<n; i++){
                str.append(arr[i]+" ");
            }
            System.out.println(str);
        }
    }
}

/*

#TEST CASE 1:
For Input: 
5
0 2 1 2 0
Your Output: 
0 0 1 2 2
Expected Output: 
0 0 1 2 2

#TEST CASE 2:
For Input: 
10
1 2 2 1 0 0 1 0 1 2
Your Output: 
0 0 0 1 1 1 1 2 2 2
Expected Output: 
0 0 0 1 1 1 1 2 2 2

#TEST CASE 3:
For Input: 
30
1 2 1 2 2 1 0 0 1 0 1 2 2 1 0 0 1 2 2 1 0 0 1 0 1 2 1 0 1 2
Your Output: 
0 0 0 0 0 0 0 0 0 1 1 1 1 1 1 1 1 1 1 1 1 2 2 2 2 2 2 2 2 2
Expected Output: 
0 0 0 0 0 0 0 0 0 1 1 1 1 1 1 1 1 1 1 1 1 2 2 2 2 2 2 2 2 2

*/
