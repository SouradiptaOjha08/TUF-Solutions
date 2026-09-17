package basic_math;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input= scanner.nextInt();
       System.out.println(isPerfect(input));
    }
    public static boolean isPerfect(int n) {
        int sum=0;
        for(int i=1;i<n;i++){
            if(n%i==0){
                sum+=i;
            }
        }
        return sum==n;
    }
}

