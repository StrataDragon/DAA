package ia2;
import java.util.Scanner;

class floyds{
	void f(int w[][],int n) {
		for(int k=0;k<n;k++)
			for(int i=0;i<n;i++)
				for(int j=0;j<n;j++)
					w[i][j]=Math.min(w[i][j], w[i][k]+w[k][j]);
	}
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n:");
		int n=sc.nextInt();
		int a[][]=new int[10][10];
		System.out.println("Enter the weighted matrix: ");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		floyds fb =new floyds();
		fb.f(a, n);
		
		System.out.println("shortest path matrix:");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
	}
}