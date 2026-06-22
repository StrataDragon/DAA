package hii;
import java.util.*;
//1. (b) Implement Java program to print Fibonacci series of a given number.
public class Fibonacci {
	static long fib(int n) {
		if(n==0||n==1) {
			return n;
		}
		return fib(n-1)+fib(n-2);
	}
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter n: ");
		int n=sc.nextInt();
		long start=System.nanoTime();
		long res=fib(n);
		long end=System.nanoTime();
		System.out.println("Fib of n: "+n+" is: "+res);
		System.out.println("time taken:"+(end-start)+"ns");
				
	}
}
