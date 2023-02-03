//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            String[] s = br.readLine().trim().split(" ");
            int[][] Intervals = new int[n][2];
            int j = 0;
            for(int i = 0; i < n; i++){
                Intervals[i][0] = Integer.parseInt(s[j]);
                j++;
                Intervals[i][1] = Integer.parseInt(s[j]);
                j++;
            }
            Solution obj = new Solution();
            int[][] ans = obj.overlappedInterval(Intervals);
            for(int i = 0; i < ans.length; i++){
                for(j = 0; j < ans[i].length; j++){
                    System.out.print(ans[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


class Solution
{
    public int[][] overlappedInterval(int[][] Intervals)
    {
        // Code here // Code here
        HashMap<Integer,Integer>store=new HashMap<>();

         Arrays.sort(Intervals,(a,b)->a[0]-b[0]);

         int l=Intervals[0][0]; int h=Intervals[0][1];

         for(int i=1; i<Intervals.length;i++){

             if(Intervals[i][0]>l&&Intervals[i][0]>h){

                 store.put(l,h);

                 l=Intervals[i][0];

                 h=Intervals[i][1];

                 if(i==Intervals.length-1){

                     store.put(l,h);

                 }

                 continue;

             }

             else if(Intervals[i][0]<h&&Intervals[i][1]>h){

                 h=Intervals[i][1];

             }

            

         }

         if(store.size()==0){

             store.put(l,h);

         }

        int i=0;

        Intervals=new int[store.size()][2];

        for(Map.Entry e : store.entrySet()){

            Intervals[i][0]=(int)e.getKey();

            Intervals[i][1]=(int)e.getValue();

            i++;

        }

        

        return Intervals;
    }
}

/*
#TEST CASE 1:
For Input: 
4
1 3 2 4 6 8 9 10
Your Output: 
1 4 6 8 9 10
Expected Output: 
1 4 6 8 9 10


*/
