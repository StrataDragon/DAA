package hii;
//6.Implement a Java program to sort a given set of elements using Quick sort method and find the time required to sort the elements
import java.util.*;
public class QuickSort {
	static int partition(int arr[],int low,int high) {
		int i=low+1;
		int j=high;
		int pivot=arr[low];
		while(true) {
			while(i<=high && arr[i]<=pivot) {
				i++;
			}
			while(arr[j]>pivot){
				j--;
			}
			if(i<j) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}else break;}
			int temp=arr[low];
			arr[low]=arr[j];
			arr[j]=temp;
			return j;
	
	}
	static void quicksort(int arr[],int low,int high) {
		if(low<high){
			int p=partition(arr,low,high);
			quicksort(arr,low,p-1);
			quicksort(arr,p+1,high);
		}
	}
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		long start=System.nanoTime();
		quicksort(arr,0,n-1);
		long end=System.nanoTime();
		System.out.println("Sorted array:");
		for(int x=0;x<n;x++) {
			System.out.print(arr[x]+" ");
		}
		System.out.print("Time taken: "+(end-start));
	}
	}

