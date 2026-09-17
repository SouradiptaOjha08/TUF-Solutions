package basic_math;

public class ArmstrongNumber {

    static boolean isArmstrong(int n) {
        int original = n;
        int sum = 0;
        int digits = String.valueOf(n).length();

        while (n > 0) {
            int lastDigit = n % 10;
            sum = (int) (sum + Math.pow(lastDigit, digits));
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
