
#include <bits/stdc++.h>

using namespace std;

int main()
{
    int n, r, c;
    for(int i=0;i<5;i++)
        for(int j=0;j<5;j++)
        {
            if(cin>>n)
            {
                if(n == 1)
                {
                    r = i;
                    c = j;
                }
            }
        }
    cout<<(abs(r-2) + abs(c-2));
}
