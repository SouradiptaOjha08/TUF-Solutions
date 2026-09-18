package basic_math;

import java.util.Scanner;

public class PrimeNumber1toN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 0;
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                count++;
            }
        }
        System.out.println(count);
    }

    private static boolean isPrime(int input) {
        if (input == 1) return false;
        for (int i = 2; i * i <= input; i++) {
            if (input % i == 0) {
                return false;
            }
        }
        return true;
    }
}
