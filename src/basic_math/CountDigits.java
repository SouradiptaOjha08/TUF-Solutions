package basic_math;

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long number =scanner.nextInt();
        System.out.println(countDigits(number));
    }

    private static int countDigits(long number) {
        int count = 0;
        if (number == 0) return 1;
        while (number > 0) {
            number = number / 10;
            count++;
        }
        return count;
    }
}
