package pattern_problems;

import java.util.Scanner;

public class pattern_7_Pyramid {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int target=s.nextInt();
		pyramid(target);
	}
	
	public static void pyramid(int N) {

		/*
		 * Pattern 7: Pyramid
		 *
		 * Example for N = 5:
		 *     *
		 *    ***
		 *   *****
		 *  *******
		 * *********
		 *
		 * How to solve:
		 * 1. Think row by row. There will be N rows.
		 * 2. In each row, print spaces first so the stars move toward the center.
		 * 3. Then print stars. Star count increases by 2 in every next row.
		 * 4. Move to the next line after completing one row.
		 *
		 * Row formula when i starts from 0:
		 * - Left spaces before stars = N - i - 1
		 * - Stars in current row      = 2 * i + 1
		 * - Right spaces are optional for console output, but printed here
		 *   to keep the pyramid width visually complete.
		 *
		 * For N = 5:
		 * i = 0 -> spaces = 4, stars = 1
		 * i = 1 -> spaces = 3, stars = 3
		 * i = 2 -> spaces = 2, stars = 5
		 * i = 3 -> spaces = 1, stars = 7
		 * i = 4 -> spaces = 0, stars = 9
		 */
		 for (int i = 0; i < N; i++)
		    {
		        // Print spaces before stars: N - i - 1 spaces are needed in row i.
		        for (int j =0; j<N-i-1; j++)
		        {
		            System.out.print(" ");
		        }

		        // Print stars: each row has odd number of stars -> 1, 3, 5, 7...
		        for(int j=0;j< 2*i+1;j++){

		            System.out.print("*");
		        }

		        // Print spaces after stars. This is not required, but keeps row width balanced.
		         for (int j =0; j<N-i-1; j++)
		        {
		            System.out.print(" ");
		        }
		       

		        // Move to the next row after printing spaces and stars for the current row.
		        System.out.println();
		    }
		}

		   
		
	}

