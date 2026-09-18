package arrays;

import java.util.Scanner;

public class ArraySortedOrNot {
    public static void main(String[] args) {
        int arr[]= {1, 25, 3 , 5 , 8};
        System.out.println(arrayIsSorted(arr));
    }

    private static boolean arrayIsSorted(int arr[]) {
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
