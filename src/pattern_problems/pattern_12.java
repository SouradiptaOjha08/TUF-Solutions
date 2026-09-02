package pattern_problems;

import java.util.Scanner;

public class pattern_12 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int target = s.nextInt();
        numberPattern(target);

    }

    private static void numberPattern(int target) {
        for (int i = 1; i <=target; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            for (int j = 1; j <=(2 * target) - (2 * i); j++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }


    }
}
