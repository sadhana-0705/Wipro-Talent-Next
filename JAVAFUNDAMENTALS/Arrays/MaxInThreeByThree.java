public class MaxInThreeByThree {
    public static void main(String[] args) {
        if (args.length != 9) {
            System.out.println("O/P: Please enter 9 integer numbers");
            return;
        }

        int[][] arr = new int[3][3];
        int count = 0;
        int max = Integer.MIN_VALUE;

        System.out.println("The given array is :");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = Integer.parseInt(args[count++]);
                System.out.print(arr[i][j] + " ");
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
            System.out.println();
        }

        System.out.println("The biggest number in the given array is " + max);
    }
}
