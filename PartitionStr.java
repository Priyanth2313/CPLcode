//Array Partition for Strings in java
import java.io.*;
import java.util.*;
package quicksortstring;

public class QuickSortString{

	private static String []a;
	public static void main(String[] args) {
	                
		a = new String[]{"Z","A","V","L"};
		System.out.println("Original String:");
		
		printArray();
                System.out.println("");
		
		sort();
		
		System.out.println("Sorted String:");
		
		//prints the sorted array
		printArray();
		
	}
 
	public static void sort(){
		int left = 0;
		int right = a.length-1;
			
		quickSort(left, right);
	}
	
	private static void quickSort(int left,int right){
		
		if(left >= right)
			return;
		
		String pivot = getMedian(left, right);
		int partition = partition(left, right, pivot);
		quickSort(0, partition-1);
		quickSort(partition+1, right);
	}

	private static int partition(int left,int right,String pivot){
		int leftCursor = left-1;
		int rightCursor = right;
		while(leftCursor < rightCursor){
	while(((Comparable<String>)a[++leftCursor]).compareTo(pivot) < 0);
        while(rightCursor > 0 && ((Comparable<String>)a[--rightCursor]).compareTo(pivot) > 0);
			if(leftCursor >= rightCursor){
				break;
			}else{
				swap(leftCursor, rightCursor);
			}
		}
		swap(leftCursor, right);
		return leftCursor;
	}
	
	public static String getMedian(int left,int right){
		int center = (left+right)/2;
		
		if(((Comparable<String>)a[left]).compareTo(a[center]) > 0)
			swap(left,center);
		
		if(((Comparable<String>)a[left]).compareTo(a[right]) > 0)
			swap(left, right);
		
		if(((Comparable<String>)a[center]).compareTo(a[right]) > 0)
			swap(center, right);
		
		swap(center, right);
		return a[right];
	}
`		public static void swap(int left,int right){
		String temp = a[left];
		a[left] = a[right];
		a[right] = temp;
	}
	
	public static void printArray(){
		for(String i : a){
			System.out.print(i+" ");
		}
