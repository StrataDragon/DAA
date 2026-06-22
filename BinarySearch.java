package hii;
import java.util.*;
//7.	Implement a Java program to search a key in a given set of elements using Binary search 
//      method and find the time required to find the key.
public class BinarySearch {
	static int BS(int arr[],int low,int high,int key) {
		while(low<=high) {
			int mid=(high+low)/2;
			if(arr[mid]==key){
				return mid;
			}else if(arr[mid]<key){
				low=mid+1;
			}
			else {
				high=mid-1;
			}
		}
		return -1;
	}
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter n: ");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.print("Enter elements: ");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.print("Enter key: ");
		int key=sc.nextInt();
		long start=System.nanoTime();
		int res=BS(arr,0,n-1,key);
		long end=System.nanoTime();
		if(res==-1) {
			System.out.print("Element not found! ");
		}else {
			System.out.println("Element: "+key+" found at pos: "+res);
		}
		System.out.print("Time taken: "+(end-start));
	}
}
