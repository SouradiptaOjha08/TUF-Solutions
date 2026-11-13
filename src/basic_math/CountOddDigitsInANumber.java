package basic_math;

import java.util.Scanner;

public class CountOddDigitsInANumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long number = scanner.nextLong();
        System.out.println(countOddDigitsInANumber(number));
    }

    private static int countOddDigitsInANumber(long number) {
        int count = 0;
        if (number == 0) return 0;

        while (number != 0) {
            long digit = Math.abs(number % 10);
            if (digit % 2 != 0) {
                count++;
            }
            number = number / 10;
        }
        return count;
    }
}
