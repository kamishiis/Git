#include <iostream>
using namespace std;

int main(){
  int n,tmp;
  int max;
  int min;
  cin >> n; 
  int prime[n];

  for(int j=0;j<n;j++){
    cin >> prime[j];
  }

  max = prime[1];
  min = prime[0];
  for(int i=1;i<n;i++){
    max = max < prime[i] ? prime[i] : max;
    min = min > prime[i] ? prime[i] : min;
  }

  cout << max-min << "\n";
}
