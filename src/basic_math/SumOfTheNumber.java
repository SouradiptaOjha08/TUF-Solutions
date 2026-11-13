package basic_math;

import java.util.Scanner;

public class SumOfTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long number = scanner.nextLong();
        System.out.println(sumOfTheNumber(number));

        scanner.close();
    }

    public static long sumOfTheNumber(long number) {
        long sum = 0;
        while (number != 0) {
            sum += Math.abs(number % 10);
            number /= 10;
        }
        return sum;
    }
}
