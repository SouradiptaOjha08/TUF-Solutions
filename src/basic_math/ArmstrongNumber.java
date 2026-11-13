package basic_math;

public class ArmstrongNumber {

    static boolean isArmstrong(int n) {
        if (n < 0) return false;
        int original = n;
        long sum = 0;
        int digits = String.valueOf(n).length();

        while (n > 0) {
            int lastDigit = n % 10;
            long poweredDigit = 1;
            for (int i = 0; i < digits; i++) {
                poweredDigit *= lastDigit;
            }
            sum += poweredDigit;
            n /= 10;
        }

        return sum == original;
    }

    public static void main(String[] args) {
        System.out.println("Is 153 an Armstrong number? " + isArmstrong(153));
        System.out.println("Is 370 an Armstrong number? " + isArmstrong(370));
        System.out.println("Is 123 an Armstrong number? " + isArmstrong(123));
    }

}
