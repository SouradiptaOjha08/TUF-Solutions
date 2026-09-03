package pattern_problems;

import java.util.Scanner;

public class pattern_14_Alphabet_pattern1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		printAlphabetPattern(n);
	}

	private static void printAlphabetPattern(int n) {
		for (int i = 1; i <= n; i++) {
			for (char ch = 'A'; ch < 'A' + i; ch++) {
				System.out.print(ch);
			}
			System.out.println();
		}
	}

}
