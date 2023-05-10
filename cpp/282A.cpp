
#include <bits/stdc++.h>

using namespace std;

int main()
{
    int n;
    int x = 0;
    string str, plus = "+", minus = "-";
    
    cin>>n;
    
    for(int i=0;i<n;i++)
    {
        cin>>str;
        if(str.find(plus) < 2)
            x++;
        else if(str.find(minus) < 2)
            x--;
    }
    



   cout<<x;
}
