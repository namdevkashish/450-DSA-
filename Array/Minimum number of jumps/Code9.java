//{ Driver Code Starts
import java.lang.*;
import java.io.*;
import java.util.*;
class GFG
 {
	public static void main (String[] args) throws IOException
	 {
	 
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        int t = Integer.parseInt(br.readLine()); 

        while(t-- > 0){
            int size = Integer.parseInt(br.readLine());
            String[] arrStr = ((String)br.readLine()).split("\\s+");
            int[] arr= new int[size];
            for(int i = 0;i<size;i++){
                arr[i] = Integer.parseInt(arrStr[i]);
            }
            System.out.println(new Solution().minJumps(arr));
        }
	 }
	 
}

// } Driver Code Ends


class Solution{
    static int minJumps(int[] arr){
        // your code here
        if(arr.length ==1) return 0;
        if(arr[0] == 0) return -1;
        
        int jump=0;
        int pos =0;
        int des =0;
        
        for(int i=0; i<arr.length-1; i++){
            des = Math.max(des,arr[i]+i);
            if(pos==i){
                pos = des;
                jump++;
            }
        }
        
        if(des < arr.length-1) return -1;
        
        return jump;
    }
}

/*

#TEST CASE 1:
For Input: 
11
1 3 5 8 9 2 6 7 6 8 9
Your Output: 
3
Expected Output: 
3

#TEST CASE 2:
For Input: 
10
41 12 23 -54 23 78 -234 -2 27 -2
Your Output: 
1
Expected Output: 
1

#TEST CASE 3:
50
41 12 23 -54 23 78 -234 -2 27 -2 1 11 3 2 5 3 76 -23 65 12 645 213 54 -323 553 24 65 -343 354 778 34 5 -354 67 346 734 6 -34 5 3 4 546 53 5 344 -234 23 57 34 888
Your Output: 
2
Expected Output: 
2

*/
