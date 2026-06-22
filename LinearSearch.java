package hii;
//4.Implement Java program for Linear search and find the time required to search the key element.
import java.util.*;
public class LinearSearch {
	static int LS(int n,int a[],int k) {
		for(int i=0;i<n;i++) {
			if(a[i]==k) {
				return i;
			}
		}
		return -1;
	}
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in); 
		System.out.println("enter n:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the elements: ");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter key to search:");
		int key=sc.nextInt();
		long start=System.nanoTime();
		int res=LS(n,arr,key);
		long end=System.nanoTime();
		long t=end-start;
		if(res==-1) {
			System.out.print("Key not found in array");
			
		}else {
			System.out.println("Key: "+key+" found at pos: "+(res+1));
		}
		System.out.print("\nTime taken: "+t+"ns");
	}
}
