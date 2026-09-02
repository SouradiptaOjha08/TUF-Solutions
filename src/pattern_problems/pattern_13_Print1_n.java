package pattern_problems;

import java.util.Scanner;

public class pattern_13_Print1_n {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		int target=s.nextInt();
		
		print1_n(target);
		
	
		
	}
	
	public static void print1_n(int n) {
		int num=1;

		for (int i=1; i<=n; i++) {
			for (int j=1; j<=i; j++) {
				
			
				System.out.print(num + " ");
				num++;
			}
			System.out.println();
		}
	}

}
