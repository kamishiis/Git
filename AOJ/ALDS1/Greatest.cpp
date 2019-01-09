#include <iostream>
using namespace std;

int calc (int x,int y){
if(y==0){
  return x;
}else{
    return calc(y,x%y);
}
}

int main(){
  long int x,y;
    cin >> x >> y;
    if(x>y){
      cout << calc(x,y) << '\n';
    }else{
      cout << calc(y,x) << '\n';
    }
}
