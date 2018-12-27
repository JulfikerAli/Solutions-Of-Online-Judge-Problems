#include<iostream>

using namespace std;

int main(){
long long n,m,a,row,column;

    cin>>n>>m>>a;

   row=(n+a-1)/a;
   column=(m+a-1)/a;

    cout<<row*column;

    return 0;
}
