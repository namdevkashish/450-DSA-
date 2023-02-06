//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

public class GFG {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int k = Integer.parseInt(inputLine[1]);
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            int ans = new Solution().getPairsCount(arr, n, k);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution {
    int getPairsCount(int[] arr, int n, int k) {
        // code here
        HashMap<Integer, Integer> mp = new HashMap<>();
        int cnt = 0;
        for(int i = 0; i < n; i++) {
            
            if(mp.containsKey(k - arr[i])) {
                cnt += mp.get(k-arr[i]);
            }
            mp.put(arr[i], mp.getOrDefault(arr[i], 0)+1);
        }
        return cnt;
    }
}

/*
#TEST CASE 1:
For Input: 
4 6
1 5 7 1
Your Output: 
2
Expected Output: 
2

*/
