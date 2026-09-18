package basic_math;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(gcdOfTwoNumbers(a, b));
    }

    private static int gcdOfTwoNumbers(int a, int b) {
        int largest = 1;
        int min = Math.min(a, b);
        for (int i = 2; i <= min; i++) {
            if (a % i == 0 && b % i == 0) {
                largest = i;
            }

        }
        return largest;
    }

}
