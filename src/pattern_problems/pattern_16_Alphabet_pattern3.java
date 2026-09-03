package pattern_problems;

/**
 * Pattern 16 - Alphabet Triangle Pattern
 * <p>
 * This program prints a right-angled triangle pattern using alphabet characters.
 * Each row contains the same character repeated, where the character and its
 * repetition count both increase with each row.
 * <p>
 * For n = 5, the output is:
 * A        (Row 1: 'A' printed 1 time)
 * BB       (Row 2: 'B' printed 2 times)
 * CCC      (Row 3: 'C' printed 3 times)
 * DDDD     (Row 4: 'D' printed 4 times)
 * EEEEE    (Row 5: 'E' printed 5 times)
 * <p>
 * Logic:
 * - Outer loop: Iterates through characters from 'A' to the nth alphabet (e.g., 'E' for n=5).
 * Variable 'c' holds the current row's character.
 * - Inner loop: Runs from 'A' to the current character 'c'. The number of iterations
 * equals the position of 'c' in the alphabet (e.g., 'C' is 3rd → 3 iterations).
 * In each iteration, it prints the character 'c' (not the loop variable 'j').
 * - After the inner loop, println() moves to the next line for the next row.
 * <p>
 * Example Trace for n = 5:
 * c='A' (1st letter): inner loop runs 1 time  → prints "A"
 * c='B' (2nd letter): inner loop runs 2 times  → prints "BB"
 * c='C' (3rd letter): inner loop runs 3 times  → prints "CCC"
 * c='D' (4th letter): inner loop runs 4 times  → prints "DDDD"
 * c='E' (5th letter): inner loop runs 5 times  → prints "EEEEE"
 */
public class pattern_16_Alphabet_pattern3 {

    public static void main(String[] args) {
        int n = 5; // Number of rows for the pattern
        pattern_16_Alphabet_pattern3 p3 = new pattern_16_Alphabet_pattern3();
        p3.pattern16(n); // Prints a 5-row alphabet triangle from 'A' to 'E'
    }

    /**
     * Prints a right-angled alphabet triangle pattern.
     *
     * @param n the number of rows in the pattern (also determines the last alphabet letter used)
     */
    public void pattern16(int n) {
        // Outer loop: controls the current character for each row, from 'A' up to n characters
        for (char c = 'A'; c < 'A' + n; c++) {
            // Inner loop: controls how many times the current character 'c' is printed.
            // Runs from 'A' to 'c', so the count equals the 1-based position of 'c' in the alphabet.
            for (char j = 'A'; j <= c; j++) {
                // Print the current row's character 'c' (not 'j') each iteration
                System.out.print(c);
            }
            // Move to the next line after printing all characters for the current row
            System.out.println();
        }
    }
}
