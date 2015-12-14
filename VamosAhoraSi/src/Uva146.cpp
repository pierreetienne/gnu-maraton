#include <iostream>
#include <algorithm>
#include <string>
using namespace std;
int main()
{
    string n = "";
    cin >> n;
    while(n!="#"){
                  if(next_permutation(n.begin(), n.end()))
                         cout << n << endl;
                   else 
                        cout << "No Successor"<<endl;                        
            cin >> n;                  
    }
    return 0;
}
