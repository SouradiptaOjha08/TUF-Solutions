package basic_math;

import java.util.Scanner;

public class PerfectNumberOptimizedSol {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input= scanner.nextInt();
        System.out.println(isPerfectOpt(input));
    }

    private static boolean isPerfectOpt(int input) {
        int sum=1;
        for(int i=2;i*i<input;i++){
            if(input%i==0){
                sum+=i;
                if (i!=(input/i)){
                    sum+=(input/i);
                }
            }
        }
        return sum==input;
    }
}
