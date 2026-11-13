package basic_math;

import java.util.Scanner;

public class ReverseOfANumber  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long number = scanner.nextLong();
        System.out.println(reverseNumber(number));
    }


    public static long reverseNumber(long number){
        long reversed = 0;
        while (number != 0) {
            long digit = number % 10;
            number /= 10;
            if (reversed > Long.MAX_VALUE / 10
                    || (reversed == Long.MAX_VALUE / 10 && digit > Long.MAX_VALUE % 10)
                    || reversed < Long.MIN_VALUE / 10
                    || (reversed == Long.MIN_VALUE / 10 && digit < Long.MIN_VALUE % 10)) {
                return 0;
            }
            reversed = reversed * 10 + digit;
        }
        return reversed;
    }

}
