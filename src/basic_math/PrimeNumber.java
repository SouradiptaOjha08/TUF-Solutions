package basic_math;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        System.out.println(isPrime(input));
    }

    private static boolean isPrime(int input) {
        if (input == 1) return false;
        for (int i = 2; i * i <=input; i++) {
            if (input % i == 0) {
                return false;
            }

        }
        return true;

    }
}
