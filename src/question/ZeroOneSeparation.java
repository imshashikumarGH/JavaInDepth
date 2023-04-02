package question;

import java.util.Arrays;

public class ZeroOneSeparation {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 1, 1, 0, 0, 0, 1, 1, 0, 0, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1};
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) count++;
        }
        Arrays.fill(arr, 0, count - 1, 0);
        Arrays.fill(arr, count, arr.length, 1);
        Arrays.stream(arr).forEach(i -> System.out.println(i));
    }
}
