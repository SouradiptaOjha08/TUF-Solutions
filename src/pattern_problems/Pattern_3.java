package pattern_problems;

import java.util.Scanner;

public class Pattern_3 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int target = s.nextInt();
        pattern3(target);


    }

    public static void pattern3(int n) {

        for (int i = 1; i <=n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}

