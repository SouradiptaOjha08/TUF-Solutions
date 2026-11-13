package basic_math;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(gcdOfTwoNumbers(a, b));
    }

    private static long gcdOfTwoNumbers(int a, int b) {
        long first = Math.abs((long) a);
        long second = Math.abs((long) b);
        long min = Math.min(first, second);
        if (min == 0) return Math.max(first, second);
        for (long i = min; i > 1; i--) {
            if (first % i == 0 && second % i == 0) {
                return i;
            }
        }
        return 1;
    }

}
