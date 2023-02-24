//{ Driver Code Starts
//Initial Template for C++

#include <bits/stdc++.h>
using namespace std;
double MedianOfArrays(vector<int>& array1, vector<int>& array2);


// } Driver Code Ends
//User function Template for C++

class Solution{
    public:
    double MedianOfArrays(vector<int>& array1, vector<int>& array2)
    {
        // Your code goes here
         int i=0, m = array1.size(), j=0, n = array2.size();
        vector<int> arr(m+n);
        int k=0, x;
        double ans;
        while (i < m && j < n) {
            if (array1[i] < array2[j])
                arr[k++] = array1[i++];
            else
                arr[k++] = array2[j++];
        }
        while (i < m)
            arr[k++] = array1[i++];
        while (j < n)
            arr[k++] = array2[j++];
 
        x = (m+n)/2;
        if((m+n)%2==0) ans = (double)(arr[x]+arr[x-1])/2;
        else ans = arr[x];
        return ans;
    }
};

//{ Driver Code Starts.

int main()
{
    int t;
    cin>>t;
    while(t--)
    {
        int m,n;
        cin>>m;
        vector<int> array1(m);
        for (int i = 0; i < m; ++i){
            cin>>array1[i];
        }
        cin>>n;
        vector<int> array2(n);
        for (int i = 0; i < n; ++i){
            cin>>array2[i];
        }
        Solution ob;
        cout<<ob.MedianOfArrays(array1, array2)<<endl;
    }
    return 0; 
}



// } Driver Code Ends

/*
#TEST CASE 1:
For Input: 
3
1 5 9
4
2 3 6 7
Your Output: 
5
Expected Output: 
5

*/
