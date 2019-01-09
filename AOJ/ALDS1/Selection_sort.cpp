#include <iostream>
#include <algorithm>
using namespace std;

int main(){
  int mini;
  int n=0;
  int count=0;
  cin >> n;
  int a[n+2];

  for (size_t i = 0; i < n; i++) {
    cin >>a[i];
  }

  for(int i=0;i<n;i++){
    mini =i;
    for(int j=i;j<n;j++){
      if(a[j] < a[mini]) mini=j;
    }
    if(i!=mini){
      swap(a[i],a[mini]);
      count++;
    }
  }

  for(int i=1;i<=n;i++)
    {
      cout << a[i];
      if(i != n)cout << " ";
    }
  cout << endl << count << endl;
  return 0;
}
