package pattern_problems;

import java.util.Scanner;

public class Inverted_triangle {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int target=s.nextInt();
		inverted(target);

	}
	
	public static void inverted(int n) {
		for (int i=0; i<n; i++) {
			
			for (int j=0; j<=n-i; j++) {
				System.out.print(" ");
			}
			for (int k=0; k<=i; k++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}

}
