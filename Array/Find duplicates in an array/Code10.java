//{ Driver Code Starts
import java.io.*;
import java.util.*;
import java.util.Map.Entry;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
            Solution g = new Solution();
            ArrayList<Integer> ans = g.duplicates(a, n);
            for (Integer val : ans) System.out.print(val + " ");
            System.out.println();
        }
    }
}

// } Driver Code Ends


class Solution {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        // code here
        Arrays.sort(arr);
        ArrayList<Integer> list = new ArrayList<>();
        int n1=Integer.MAX_VALUE;
        for(int i =0 ; i < arr.length-1 ; i++)
        {
            
            if(arr[i] == arr[i+1] && arr[i] != n1)
            {
                
                    list.add(arr[i]);   
                    n1 = arr[i];
            }
        }
        if(list.isEmpty())
        {
            list.add(-1);
        }
        
           return list;
    }
}

/*
#TEST CASE 1:
For Input: 
4
0 3 1 2
Your Output: 
-1
Expected Output: 
-1

*/
