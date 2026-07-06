import java.util.Arrays;

public class MiddleWayArray {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] b = {4, 5, 6};
        System.out.println("Result: " + Arrays.toString(middleWay(a, b)));
    }

    public static int[] middleWay(int[] a, int[] b) {
        return new int[]{a[1], b[1]};
    }
}
