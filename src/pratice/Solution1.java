package pratice;

public class Solution1 {
    public static void main(String[] args) {

        int[] arr = new int[]{3, 2, 4};
        Solution1 solution1 = new Solution1();
        System.out.println(solution1.twoSum(arr, 6));

    }

    public int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            int x = target - nums[i];
            for (int j = nums.length - 1; j > i; j--) {
                //if(x>nums[j]) break;
                if (x == nums[j]) {
                    int[] arr = new int[]{i, j};
                    return arr;
                }

            }
        }
        return null;
    }
}
