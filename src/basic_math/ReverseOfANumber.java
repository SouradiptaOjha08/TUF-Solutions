package basic_math;

import java.util.Scanner;

public class ReverseOfANumber  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long number =scanner.nextInt();
        System.out.println(reverseNumber(number));
    }


    public static long reverseNumber(long number){
        long sum=0;
        while (number>0){
            int remainder= (int) (number % 10);
            sum= sum*10 +remainder ;
            number /=10;
        }
        return sum;
    }

}
