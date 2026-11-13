package basic_math;

import java.util.Scanner;

public class CheckPalindrome {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        System.out.println(checkPalindrome(n));
    }

    private static boolean checkPalindrome(long n) {
        if (n < 0) return false;
        long copy = n;
        return ReverseOfANumber.reverseNumber(n) == copy;
    }

}




