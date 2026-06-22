package hii;
//1.(a) Implement Java program to find Factorial of a given number.
import java.util.*;
public class fact {
	static int factorial(int n) {
		if(n==0||n==1) {
			return 1;
		}
		return n*factorial(n-1);
	}
	public static void main (String []args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n");
		int n=sc.nextInt();
		long start=System.nanoTime();
		double res=factorial(n);
		long end=System.nanoTime();
		System.out.println("Factorial of : "+n+" is :"+res);
		System.out.println("Time taken: "+(end-start)+"ns");
	}
}
