package pattern_problems;

import java.util.Scanner;

public class pattern_11_Flip_Nums {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int target=s.nextInt();
		flipNums(target);
		

	}
	
	/*
	 * Logic:
	 * 1. The pattern has N rows, where row i prints i + 1 numbers.
	 * 2. Even-indexed rows start with 1, odd-indexed rows start with 0.
	 *    This creates the required flipped starting value for every row.
	 * 3. For each value printed in a row, flip the current number using:
	 *       start = 1 - start
	 *    If start is 1, it becomes 0; if start is 0, it becomes 1.
	 * 4. After printing all numbers in the current row, print a newline.
	 *
	 * Example for N = 5:
	 * 1
	 * 01
	 * 101
	 * 0101
	 * 10101
	 */
	static void flipNums(int N)
	{
	     // First row starts by printing a single 1.
	      int start =1;
	      
	      // Outer loop for the no. of rows
	      for(int i=0;i<N;i++){
	          
	          // if the row index is even then 1 is printed first
	          // in that row.
	          if(i%2 ==0) start = 1;
	          
	          // if odd, then the first 0 will be printed in that row.
	          else start = 0;
	          
	          // We alternatively print 1's and 0's in each row by using
	          // the inner for loop.
	          for(int j=0;j<=i;j++){
	              System.out.print(start);
	              start = 1-start;
	          }
	      
	      
	        // As soon as the numbers for each iteration are printed, we move to the
	        // next row and give a line break otherwise all numbers
	        // would get printed in 1 line.
	        System.out.println();
	      }
	}

}
