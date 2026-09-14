package basic_math;

import java.util.Scanner;

public class CountOddDigitsInANumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println(countOddDigitsInANumber(number));
    }

    private static int countOddDigitsInANumber(int number) {
        int count = 0;
        if (number == 0) return 0;

        while (number > 0) {
            int checkNumber = number % 10;
            if (checkNumber % 2 != 0) {
                count++;
            }
            number = number / 10;
        }
        return count;
    }
}
