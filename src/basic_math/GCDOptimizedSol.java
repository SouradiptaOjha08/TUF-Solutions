package basic_math;

import java.util.Scanner;


public class GCDOptimizedSol {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(gcdOfTwoNumbers(a, b));
    }

    private static int gcdOfTwoNumbers(int a, int b) {
        while (b != 0) {
            int remainder = a % b;
            a = b;
            b = remainder;

        }
        return a;
    }

}
