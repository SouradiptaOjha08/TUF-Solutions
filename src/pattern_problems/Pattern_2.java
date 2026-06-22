package pattern_problems;

import java.util.Scanner;

public class Pattern_2 {

	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		int target=s.nextInt();
		pattern1(target);
		pattern2(target);


	}

	public static void pattern1(int n) {

		for (int i=0; i<n; i++) {
			for (int j=0; j<=i; j++) {
				System.out.print("* ");	
			}
			System.out.println();
		}
	}
	
	
	
	public static void pattern2(int n) {

		for (int i=1; i<=n; i++) {
			for (int j=1; j<=i; j++) {
				System.out.print(j + " ");	
			}
			System.out.println();
		}
	}

}


