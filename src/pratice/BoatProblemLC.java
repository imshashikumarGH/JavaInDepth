package pratice;

public class BoatProblemLC {

    public static int numRescueBoats(int[] arr, int limit) {
        int res = 0;
        //Arrays.sort(arr);
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (count + arr[i] == limit) {
                res++;
                count = 0;
            } else if (count + arr[i] > limit) {
                res++;
                count = arr[i];
            } else {
                count = count + arr[i];
            }
        }
        if (count > 0) {
            res++;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{3, 8, 7, 1, 4};
        System.out.println(numRescueBoats(arr, 9));
    }
}
