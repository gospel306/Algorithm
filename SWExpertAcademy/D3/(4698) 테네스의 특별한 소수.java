#include<iostream>
#include<string>
using namespace std;
int main()
{
   int n = 0;

   //int multiple = 0;
   int num;
   //int AUnit = 1;
   //int Try = 0;
   //int limit = 0;
   string str;


   cin >> num;
   int* a = new int[num*3];   // 이거시 문제!
   for (int i = 0; i < 3*num; i++)
      cin >> a[i];
   
      int *sosu = new int[1000001];
      for (int i = 2; i <= 1000000; i++)
      {
         sosu[i] = i;
      }
      for (int j = 2; j <= 1000; j++) {
         
         for (int i = 2; i <= 1000000; i++)
         {
            if (sosu[i] == 0) {}
            else if (((sosu[i] % j) == 0) && (sosu[i] != j))  sosu[i] = 0;

         }
      }
      for (int s = 1; s <= num; s++) {
         if (a[1 + (s-1) * 3] < 2) a[1 + (s - 1) * 3] = 2;
      for (int i = a[1 + (s - 1) * 3]; i < a[2 + (s - 1) * 3]; i++)
      {
         if (sosu[i] != 0) {
            str = to_string(sosu[i]);
            if (str.find(to_string(a[0 + (s - 1) * 3])) != string::npos) {
               //cout << sosu[i] << endl; cout << n << endl;
               n++;
            }
         }
      }
      cout << "#" << s << " " << n << endl;
      n = 0;
   }

   cin >> n;
}
