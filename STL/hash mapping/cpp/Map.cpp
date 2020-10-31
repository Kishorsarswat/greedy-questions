// A simple code to implement MAP in c++

#include <iostream>
#include <map>
using namespace std;

int main (){
  map<char,int> ANOM;
                              //initializing number with char map
  ANOM['a']=100;
  ANOM['b']=2330;
  ANOM['c']=3062;
  ANOM['d']=402;
  ANOM['e']=4233;

   map<char, int>::iterator it;

   for(it = ANOM.begin() ; it! = ANOMr.end() ; ++it){   //iterating through the map
      cout << it->first << " => " << it->second << '\n';
   }

  return 0;
}
