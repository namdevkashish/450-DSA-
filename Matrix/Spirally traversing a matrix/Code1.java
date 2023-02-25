//{ Driver Code Starts
#include <bits/stdc++.h> 
using namespace std; 

// } Driver Code Ends
class Solution
{   
    public: 
    //Function to return a list of integers denoting spiral traversal of matrix.
    vector<int> spirallyTraverse(vector<vector<int> > matrix, int r, int c) 
    {
        // code here 
        int left = 0;
        int right = c-1;
        int top = 0;
        int bottom = r-1;
        
        vector<int> v;
        
        while(top<=bottom && left<=right)
        {
            for(int i=left; i<=right; i++){
                v.push_back(matrix[top][i]);
            }
            top = top + 1;
            
            for(int i=top; i<=bottom; i++){
                v.push_back(matrix[i][right]);
            }
            right = right -1;
            
            if(top<=bottom){
                for(int i=right; i>=left; i--){
                    v.push_back(matrix[bottom][i]);
                }
                bottom = bottom - 1;
            }
            
            if(left<=right){
                for(int i=bottom; i>=top; i--){
                    v.push_back(matrix[i][left]);
                }
                left = left + 1;
            }
        }
        return v;
    }
};

//{ Driver Code Starts.
int main() {
    int t;
    cin>>t;
    
    while(t--) 
    {
        int r,c;
        cin>>r>>c;
        vector<vector<int> > matrix(r); 

        for(int i=0; i<r; i++)
        {
            matrix[i].assign(c, 0);
            for( int j=0; j<c; j++)
            {
                cin>>matrix[i][j];
            }
        }

        Solution ob;
        vector<int> result = ob.spirallyTraverse(matrix, r, c);
        for (int i = 0; i < result.size(); ++i)
                cout<<result[i]<<" ";
        cout<<endl;
    }
    return 0;
}
// } Driver Code Ends

/*
#TEST CASE 1:
For Input: 
4 4
1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16
Your Output: 
1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10
Expected Output: 
1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10

*/
