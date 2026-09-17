package basic_math;

import java.util.Scanner;

public class CheckPalindrome {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextInt();
        System.out.println(checkPalindrome(n));
    }

    private static boolean checkPalindrome(long n) {
        long copy = n;
    /* After the code, revNum will
    contain the reversed number */
        long revNum = 0;
    /* Keep on iterating while there
    are digits left to extract */
        while (n > 0) {
            long lastDigit = n % 10;
      /* Pushing last digit at the
      back of reversed number */
            revNum = (revNum * 10) + lastDigit;
            n = n / 10;
        }
    /* Return true if the reversed and
    copy of original number is same */
        return revNum == copy;
    }

}




