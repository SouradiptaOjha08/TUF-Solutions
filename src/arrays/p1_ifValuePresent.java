package arrays;

public class p1_ifValuePresent {
    public static void main(String[] args) {
        int[] arr = {7, 9, 5, 98, 4, 2, 6};
        int target = 6;
        System.out.println(ifValuePresent(arr, target));
    }

    public static int ifValuePresent(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

}
