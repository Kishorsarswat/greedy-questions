: Code contributed by - anom

#include <iostream>
#include <vector>
using namespace std;
 
int main() {

   vector<int> vec; // create a vector to store int
   int i;                                     
   cout << "vector size = " << vec.size() << endl;    // at first we have 0 size of vector

   
   for(i = 0; i < 5; i++) {     // push 5 values into the vector
      vec.push_back(i);
   }

   // access 5 values from the vector
   for(i = 0; i < 5; i++) {
      cout << "value of vec [" << i << "] = " << vec[i] << endl;
   }
return 0;
}
