package basic_math;

import java.util.Scanner;

public class LCMOptimizedSol {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int max = Math.max(a, b);
        System.out.println(lcmOfTwo(a, b));
    }

    private static int gcdOfTwoNumbers(int a, int b) {
        while (b != 0) {
            int remainder = a % b;
            a = b;
            b = remainder;
        }
        return a;
    }


    private static int lcmOfTwo(int a, int b) {
        int gcd = gcdOfTwoNumbers(a, b);
        return (a / gcd) * b;

    }
}
