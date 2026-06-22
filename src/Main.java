import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println(sumOfTheNumber(number));

    }

    public static long sumOfTheNumber(int number) {
        long sum = 0;
        while (number > 0) {
            sum = number % 10 + sum;
            number /= 10;
        }
        return sum;
    }
}