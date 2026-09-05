package arrays;

public class p2_maxOfArray {
    public static void main(String[] args) {

        int[] arr = {7, 9, 5, 98, 4, 2, 6};
        System.out.println(largest(arr));

    }

    public static int largest(int[] arr) {

        int target = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > target) {
                target = arr[i];
            }

        }

        return target;
    }

}

