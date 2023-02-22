//{ Driver Code Starts
import java.util.*;
class PalindromicArray{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
			int n = sc.nextInt();
			int[] a = new int[n];
			for(int i = 0 ;i < n; i++)
				a[i]=sc.nextInt();
			GfG g = new GfG();
			System.out.println(g.palinArray(a , n));
		}
	}
}
// } Driver Code Ends


/*Complete the Function below*/
class GfG
{
	public static int palinArray(int[] a, int n)
    {
        //add code here.
        for (int i = 0; i < n; i++) {
            String num = String.valueOf(a[i]);
            String reverse = new StringBuilder(num).reverse().toString();
        
            if (!num.equals(reverse)) {
                return 0;
            }
        }
        return 1;
    }
}

/*
#TEST CASE 1:
For Input: 
5
111 222 333 444 555
Your Output: 
1
Expected Output: 
1
*/
