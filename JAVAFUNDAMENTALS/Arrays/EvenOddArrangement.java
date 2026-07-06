import java.util.Arrays;

public class EvenOddArrangement {
    public static void main(String[] args) {
        int[] case1 = {1, 0, 1, 0, 0, 1, 1};
        System.out.println("Result: " + Arrays.toString(evenOdd(case1)));
    }

    public static int[] evenOdd(int[] nums) {
        int[] result = new int[nums.length];
        int left = 0;
        int right = nums.length - 1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                result[left++] = nums[i];
            } else {
                result[right--] = nums[i];
            }
        }
        return result;
    }
}
