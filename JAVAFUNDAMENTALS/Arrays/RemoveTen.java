import java.util.Arrays;

public class RemoveTen {
    public static void main(String[] args) {
        int[] case1 = {1, 10, 10, 2};
        System.out.println("Result: " + Arrays.toString(withoutTen(case1)));
    }

    public static int[] withoutTen(int[] nums) {
        int[] result = new int[nums.length];
        int index = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 10) {
                result[index++] = nums[i];
            }
        }
        return result;
    }
}
