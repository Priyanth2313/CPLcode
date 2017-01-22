//Array Partition for Integers in java
import java.io.*;
import java.util.*;

public class Partition {

   
    private int array[];
    private int length;
 
    public void sort(int[] inputArr) 
    {
         
        if (inputArr == null || inputArr.length == 0) {
            return;
        }
        this.array = inputArr;
        length = inputArr.length;
        quickSort(0, length - 1);
    }
 
    private void quickSort(int smallIndex, int bigIndex) //QuickSort Function
    {
         
        int i = smallIndex;
        int j = bigIndex;
        
        int pivot = array[smallIndex+(bigIndex-smallIndex)/2]; //Radom Pivot Point
        while (i <= j) {
            
            while (array[i] < pivot) {
                i++;
            }
            while (array[j] > pivot) {
                j--;
            }
            if (i <= j) {
                exchangeNumbers(i, j);
                i++;
                j--;
            }
        }
        if (smallIndex < j)
            quickSort(smallIndex, j);
        if (i < bigIndex)
            quickSort(i, bigIndex);
    }
 
    private void exchangeNumbers(int i, int j) //Swapping Function
    {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {
        // code application logic here
        Partition sorter = new Partition();
        int[] input = {3,2,1,7,6,8,0,9,4};
        System.out.println("Array Length: "+input.length);
        System.out.println("Before Sort");
        for (int j:input)
        { 
            System.out.print(j);
            System.out.print(" ");
        }
        System.out.println("");
        System.out.println("After Sort");
        sorter.sort(input);
        for(int i:input){
            System.out.print(i);
            System.out.print(" ");
    }
    
    }
}



