package basic_math;

import java.util.Scanner;

public class SumOfTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        System.out.println(sumOfTheNumber(number));

        scanner.close();
    }

    public static long sumOfTheNumber(int number) {
        long sum = 0;
        while (number > 0) {
            sum = number % 10 + sum;
            number /= 10;
        }
        return sum;
    }
}
