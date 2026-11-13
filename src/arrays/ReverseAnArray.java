package arrays;

import java.util.Scanner;

public class ReverseAnArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        if (size < 0) {
            throw new IllegalArgumentException("Array size must not be negative.");
        }

        int[] values = new int[size];
        for (int i = 0; i < size; i++) {
            values[i] = scanner.nextInt();
        }

        reverse(values);
        for (int i = 0; i < values.length; i++) {
            if (i > 0) System.out.print(" ");
            System.out.print(values[i]);
        }
        System.out.println();
        scanner.close();
    }

    public static void reverse(int[] values) {
        int left = 0;
        int right = values.length - 1;
        while (left < right) {
            int current = values[left];
            values[left] = values[right];
            values[right] = current;
            left++;
            right--;
        }
    }
}
