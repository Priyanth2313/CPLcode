//Array Partition for Strings in C++
#include <cstdlib>
#include <string.h>
#include<iostream>

void quickSortMain(char items[][10], int count);
void quickSort(char items[][10], int left, int right);
using namespace std;
int main()
{
  int i;
  char str[][10] = {"this","is","a","project"};
  cout<<"Before Sort"<<"\n";
  for(i=0;i<4;i++)
  {
      cout<<str[i]<<" "<<"\n";
  }
  cout<<"\n\n";
  quickSortMain(str, 4);
  cout<<"After Sort"<<"\n";
  for(i=0; i<4; i++) {
     
     cout<<str[i]<<" "<<"\n";
  }
  return 0;
}
void quickSortMain(char items[][10], int count)
{
  quickSort(items, 0, count-1);
}

void quickSort(char items[][10], int left, int right)
{
  int i, j;
  char *x;
  char temp[10];

  i = left;
  j = right;
  x = items[(left+right)/2];

  do {
    while((strcmp(items[i],x) < 0) && (i < right)) {
       i++;
    }
    while((strcmp(items[j],x) > 0) && (j > left)) {
        j--;
    }
    if(i <= j) {
      strcpy(temp, items[i]);
      strcpy(items[i], items[j]);
      strcpy(items[j], temp);
      i++;
      j--;
   }
  } while(i <= j);

  if(left < j) {
     quickSort(items, left, j);
  }
  if(i < right) {
     quickSort(items, i, right);
  }
}


