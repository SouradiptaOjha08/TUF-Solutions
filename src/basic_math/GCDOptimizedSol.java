package basic_math;

import java.util.Scanner;


public class GCDOptimizedSol {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(gcdOfTwoNumbers(a, b));
    }

    private static long gcdOfTwoNumbers(int a, int b) {
        long first = Math.abs((long) a);
        long second = Math.abs((long) b);
        while (second != 0) {
            long remainder = first % second;
            first = second;
            second = remainder;

        }
        return first;
    }

}
