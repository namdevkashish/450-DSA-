import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
	    
	    //Taking input using class Scanner
		Scanner sc=new Scanner(System.in);
		
		//Taking total count of testcases
		int t=sc.nextInt();
		sc.nextLine();
		while(t-->0)
		{
		    
		    int n,m;
		    
		    //taking size of array a
		    n=sc.nextInt();
		    
		    //taking size of array b
		    m=sc.nextInt();
		    
		    //Creating 2 array of size n and m
		    int a[]=new int[n];
		    int b[]=new int[m];
		    
		    //inserting elements to array a
		    for(int i=0;i<n;i++)
		    {
		        a[i]=sc.nextInt();
		    }
		    
		    //inserting elements to array b
		    for(int i=0;i<m;i++)
		    {
		        b[i]=sc.nextInt();
		    }
		    Solution ob=new Solution();
		    //calling doUnion method and printing the results
		    System.out.println(ob.doUnion(a,n,b,m));
		}
		
	}
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    public static int doUnion(int a[], int n, int b[], int m) 
    {
        //Your code here
        int count=0;
        int [] arr = new int[n+m];
        for(int i=0; i<n; i++){
            arr[i]=a[i];
        }
        for(int i=0; i<m; i++){
            arr[i+n]=b[i];
        }
        Arrays.sort(arr);
        for(int i=0; i<arr.length-1; i++){
            if(arr[i]!=arr[i+1]){
                count++;
            }
        }
        return count+1;
    }
}

/*

#TEST CASE 1:
For Input: 
10 5
1 2 3 4 5 6 7 8 9 0
1 2 3 0 7
Your Output: 
10
Expected Output: 
10

#TEST CASE 2:
10 5
1 2 3 4 5 6 7 8 9 0
1 2 3 0 11
Your Output: 
11
Expected Output: 
11

#TEST CASE 3:
5 5
11 12 13 14 15 
21 22 23 24 25
Your Output: 
10
Expected Output: 
10

*/
