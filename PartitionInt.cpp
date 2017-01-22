//Array Partition for Integers in C++
#include <iostream>
 
void quickSort(int a[], int first, int last);
int pivot(int a[], int first, int last);
void swap(int& a, int& b);
void swapNoTemp(int& a, int& b);
void print(int array[], const int& N);
 
using namespace std;
 
int main()
{
    int test[] = {3,2,1,7,6,8,0,9,4};
    int N = sizeof(test)/sizeof(int);
 
    cout << "array length :"  << N << endl;
 
    cout << "Before sorting : " << endl;
    print(test, N);
 
    quickSort(test, 0, N-1);
 
    cout << endl << endl << "After sorting : " << endl;
    print(test, N);
     
    return 0;
}
 
//QuickSort Function
void quickSort( int a[], int first, int last ) 
{
    int pivotValue;
 
    if(first < last)
    {
        pivotValue = pivot(a, first, last);
        quickSort(a, first, pivotValue-1);
        quickSort(a, pivotValue+1, last);
    }
}
 
//Select Pivot Point
int pivot(int a[], int first, int last) 
{
    int  p = first;
    int pivotValue = a[first];   
    for(int i = first+1 ; i <= last ; i++)
    {
        if(a[i] <= pivotValue)
        {
            p++;
            swap(a[i], a[p]);
        }
    }
 
    swap(a[p], a[first]);
 
    return p;
}
  
//Swapping Values
void swap(int& a, int& b)
{
    int temp = a;
    a = b;
    b = temp;
}
 
void print(int a[], const int& N)
{
    for(int i = 0 ; i < N ; i++)
        cout << "array[" << i << "] = " << a[i] << endl;
}

