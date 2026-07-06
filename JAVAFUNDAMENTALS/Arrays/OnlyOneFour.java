import java.util.Arrays;

public class OnlyOneFour {
    public static void main(String[] args) {
        int[] case1 = {1, 4, 1, 4};
        int[] case2 = {1, 4, 2, 4};
        System.out.println("Result 1: " + only14(case1));
        System.out.println("Result 2: " + only14(case2));
    }

    public static boolean only14(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 1 && nums[i] != 4) {
                return false;
            }
        }
        return true;
    }
}
