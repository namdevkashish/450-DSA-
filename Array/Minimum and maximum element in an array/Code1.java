import java.util.*;
import java.lang.*;
import java.io.*;

class pair  
{  
    long first, second;  
    public pair(long first, long second)  
    {  

        this.first = first;  
        this.second = second;  
    }  
}

class GFG {
	public static void main(String[] args) throws IOException
	{
	        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            long n = Long.parseLong(br.readLine().trim());
            long a[] = new long[(int)(n)];
            // long getAnswer[] = new long[(int)(n)];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(inputLine[i]);
            }
            
            Compute obj = new Compute();
            pair product = obj.getMinMax(a, n); 
            System.out.println(product.first+" "+product.second);
            
        }
	}
}

class Compute 
{
    static pair getMinMax(long a[], long n)  
    {
         Arrays.sort(a);
        
        long min = a[0];
        long max = a[a.length-1];

        return (new pair(min,max));
    }
}

/*
#TEST CASE 1:
For Input: 
6
3 2 1 56 1000 167
Your Output: 
1 1000
Expected Output: 
1 1000

#TEST CASE 2:
For Input: 
7
45 12 67 8746 100000 2343545 234
Your Output: 
12 2343545
Expected Output: 
12 2343545

#TEST CASE 3:
For Input: 
12
8746 100000 2343545 234 343 235465676887 24325435 354 12435 3243554 3454454 1323
Your Output: 
234 235465676887
Expected Output: 
234 235465676887

*/
