package hii;
//3.Implement a Java program to generate list of prime numbers using Sieve of Eratosthenes.
import java.util.*;	
public class Sieve {
	public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the limit: ");
	int n=sc.nextInt();
	boolean bool[]=new boolean[n+1];
	for(int i=0;i<=n;i++) {
		bool[i]=true;
	}
	bool[0]=false;
	bool[1]=false;
	for(int i=2;i*i<=n;i++) {
		if(bool[i]==true) {
			for(int j=i*i;j<=n;j+=i) {
				bool[j]=false;
			}
		}
	}
	System.out.println("Prime nums: ");
	for(int i=2;i<=n;i++) {
		if(bool[i]==true) {
			System.out.print(i+" ");
		}
	}
	sc.close();
	}
}
