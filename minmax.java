package hii;
import java.util.*;
public class minmax {
	static int min,max;
	static void min_max(int arr[],int i,int j) {
		int min1=min;
		int max1=max;
		if(i==j) {
			min=max=arr[i];
		}else if(i==j-1) {
			if(arr[i]<arr[j]) {
				min=arr[i];
				max=arr[j];
			}else {
				max=arr[i];
				min=arr[j];
			}
		}else {
			int mid=(i+j)/2;
			min_max(arr,i,mid);
			max1=max;
			min1=min;
			min_max(arr,mid+1,j);
			if(max<max1) {
				max=max1;
			}
			if(min>min1) {
				min=min1;
			}
		}
	}
		public static void main(String args[]) {
			Scanner sc=new Scanner(System.in);
			System.out.print("enter n: ");
			int n=sc.nextInt();
			int arr[]=new int[n];
			max=Integer.MIN_VALUE;
			min=Integer.MAX_VALUE;
			for(int i=0;i<n;i++) {
				arr[i]=sc.nextInt();
			}
			long start = System.nanoTime();
			min_max(arr,0,n-1);
			long end = System.nanoTime();
			System.out.println("Max: "+max);
			System.out.println("Min: "+min);
			System.out.println("Time taken: "+(end-start)+"ns");
		}
	
}
	

