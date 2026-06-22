package hii;
import java.util.*;
import java.util.Random;
public class MergeSort {
	static void mergeSort(int arr[],int low,int mid,int high) {
		int i=low;
		int j=mid+1;
		int k=0;
		
		int temp[]=new int[high-low+1];
		while(i<=mid && j<=high) {
			if(arr[i]<arr[j]) 
				temp[k++]=arr[i++];
			else 
				temp[k++]=arr[j++];
			
		}
		while(i<=mid) 
			temp[k++]=arr[i++];
		
		while(j<=high) 
			temp[k++]=arr[j++];
		
		for(i=low,k=0;i<=high;i++,k++) 
			arr[i]=temp[k];
		
	}
	
	static void merge(int arr[],int low,int high) {
		int mid=(high+low)/2;
		if(low<high) {
			merge(arr,low,mid);
			merge(arr,mid+1,high);
			mergeSort(arr,low,mid,high);
		}
	}
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		Random rand=new Random();
		System.out.println("Enter n:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=rand.nextInt(100);
		}
		long start=System.nanoTime();
		merge(arr,0,n-1);
		long end=System.nanoTime();
		System.out.print("Time taken: "+(end-start));
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}