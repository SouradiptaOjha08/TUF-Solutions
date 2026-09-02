package pattern_problems;

import java.util.Scanner;

public class pattern_8_ReversePyramid {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int target=s.nextInt();
        reversePyramid(target);
    }

    private static void reversePyramid(int target) {
        for (int rows=0 ; rows < target; rows++){
            for (int spaces =0; spaces < rows ; spaces++){
                System.out.print(" ");
            }
            for ( int stars=0; stars < (2*target) - (2*rows+1) ; stars++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
