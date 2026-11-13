package basic_math;

import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(lcmOfTwo(a, b));
    }

    private static long lcmOfTwo(int a, int b) {
        long first = Math.abs((long) a);
        long second = Math.abs((long) b);
        if (first == 0 || second == 0) return 0;
        long gcd = gcdOfTwoNumbers(first, second);
        return first / gcd * second;
    }

    private static long gcdOfTwoNumbers(long first, long second) {
        while (second != 0) {
            long remainder = first % second;
            first = second;
            second = remainder;
        }
        return first;
    }
}
