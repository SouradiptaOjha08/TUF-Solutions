package basic_math;

import java.util.Scanner;

public class LCMOptimizedSol {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(lcmOfTwo(a, b));
    }

    private static long gcdOfTwoNumbers(long a, long b) {
        while (b != 0) {
            long remainder = a % b;
            a = b;
            b = remainder;
        }
        return a;
    }


    private static long lcmOfTwo(int a, int b) {
        long first = Math.abs((long) a);
        long second = Math.abs((long) b);
        if (first == 0 || second == 0) return 0;
        long gcd = gcdOfTwoNumbers(first, second);
        return first / gcd * second;

    }
}
