package hii;
//2. (b) Implement a Java program for Tower of Hanoi problem.
import java.util.*;
public class TowerOfHanoi {
	static void TOH(int n,char s,char t,char d) {
		if(n==0) {
			return;
		}
		TOH(n-1,s,d,t);
		System.out.println("Moving disk "+n+" From: "+s+" to: "+d);
		TOH(n-1,t,s,d);
	}
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter n: ");
		int n=sc.nextInt();
		long start=System.nanoTime();
		TOH(n,'a','b','c');
		long end=System.nanoTime();
		System.out.println("Time taken: "+(end-start)+"ns");
	}
}
