package pattern_problems;

public class pattern_15_Alphabet_pattern_2 {

    /**
     * Prints an inverted alphabet pattern.
     *
     * <p>For {@code n = 5}, the output is:</p>
     * <pre>
     * ABCDE
     * ABCD
     * ABC
     * AB
     * A
     * </pre>
     *
     * <p>The outer loop selects the row. On row {@code i}, we print
     * {@code n - i} letters, so every next row has one fewer letter than the
     * previous one. The inner loop always starts from {@code 'A'} and stops at
     * the character whose offset is {@code n - i - 1}.</p>
     *
     * @param n the number of rows and the number of letters in the first row
     */
    public void pattern15(int n) {
        for (int i = 0; i < n; i++) {
            // Row 0 prints n letters, row 1 prints n - 1, and so on.
            // For n = 5 and i = 1, the last letter is 'A' + (5 - 1 - 1) = 'D'.
            for (char ch = 'A'; ch <= 'A' + (n - i - 1); ch++) {
                System.out.print(ch);
            }
            // Move to the next line after the current row is complete.
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 5;

        // Create the pattern object and print five decreasing alphabet rows.
        pattern_15_Alphabet_pattern_2 pattern = new pattern_15_Alphabet_pattern_2();
        pattern.pattern15(n);
    }
}
