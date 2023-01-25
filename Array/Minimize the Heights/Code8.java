//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

  public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int k = Integer.parseInt(inputLine[0]);
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int ans = new Solution().getMinDiff(arr, n, k);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    int getMinDiff(int[] arr, int n, int k) {
        // code here
        if(n==1)return 0;
        Arrays.sort(arr);
        int ans = arr[n-1]-arr[0];
        int min,max;
        for(int i=1;i<n;i++){
            if(arr[i]-k<0)continue;
            max = Math.max(arr[i-1]+k,arr[n-1]-k);
            min = Math.min(arr[i]-k,arr[0]+k);
            ans = Math.min(ans,max-min);
        }
        return ans;
    }
}

/*

#TEST CASE 1:
For Input: 
2
4
1 5 8 10
Your Output: 
5
Expected Output: 
5

#TEST CASE 2:
For Input: 
5
12
5 8 10 11 33 45 23 64 1 52 55 66
Your Output: 
55
Expected Output: 
55

#TEST CASE 3:
For Input: 
6
60
5 8 10 11 33 451 23 64 1 52 55 66 34 12 5 7 335 7554 45 3 2 32 323 23 45 2 5 3 5 5 8787 4 87 8789 7 5 54 54 23 32 2 5 34 6 643 7 5 4 687 54 57 2 7 3 578 5 42 8 6 27 2 67 42 24 8 6 67 3256 6 32 .................
 Input is too large Download Full File 
Your Output: 
8776
Expected Output: 
8776

*/
