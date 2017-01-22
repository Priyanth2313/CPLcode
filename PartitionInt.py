//Array Partition for Integers in python
def quickSort(alist):
   quickSortHelper(alist,0,len(alist)-1)

def quickSortHelper(alist,first,last):
   if first<last:

       pivotValue = partition(alist,first,last)

       quickSortHelper(alist,first,pivotValue-1)
       quickSortHelper(alist,pivotValue+1,last)


def partition(alist,first,last):
   pivotvalue = alist[first]

   leftmark = first+1
   rightmark = last

   done = False
   while not done:

       while leftmark <= rightmark and \
               alist[leftmark] <= pivotvalue:
           leftmark = leftmark + 1

       while alist[rightmark] >= pivotvalue and \
               rightmark >= leftmark:
           rightmark = rightmark -1

       if rightmark < leftmark:
           done = True
       else:
           temp = alist[leftmark]
           alist[leftmark] = alist[rightmark]
           alist[rightmark] = temp

   
   [alist[first], alist[rightmark]]= [alist[rightmark], alist[first]]
   

   return rightmark

alist = [3,2,1,7,6,8,0,9,4]
print("Before Sort")
print(alist)
quickSort(alist)
print("After Sort")
print(alist)

