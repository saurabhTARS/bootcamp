
#include <bits/stdc++.h>

using namespace std;

int main()
{
    vector<vector<int>> a = {
        {1, 1, 0},
        {1, 0, 0},
        {0, 0, 0}
    };

    vector<int> ans = {0, 0, 0, 0, 0};

    vector<vector<int>> black = {
        {0, 0}, {0, 1}, {1, 0}
    };

   for(int i=0;i<2;i++)
   {
    int c = 0;

    for(int j=0;j<2;j++)
    {
        if(a[i][j] == 1) c++;
        if(a[i][j+1] == 1) c++;
        if(a[i+1][j] == 1) c++;
        if(a[i+1][j+1] == 1) c++;
    }
    ans[c]++;
   }

   for(int i : ans) 
   {
    cout<<i<<endl;
   }

    
}
