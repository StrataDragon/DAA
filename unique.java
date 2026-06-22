package hii;
import java.util.*;
//2.(a) Implement Java program to check whether elements in an array is unique or not.
public class unique {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size: ");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the elements: ");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Unique elements in array");
		boolean found;
		int f=0;
		for(int i=0;i<n;i++) {
			found=false;
			for(int j=i+1;j<n;j++) {
				if((i!=j) && (arr[i]==arr[j])) {
					found=true;
					f=1;
					break;
				}
			}
		
			if(!found) {	
				System.out.print(arr[i]+" ");
			}
			}
		if(f==1) {
			System.out.println("\nGiven input array is Not unique ");
		}else {
			System.out.println("\nGiven input array is Unique");
		}
	}

}
