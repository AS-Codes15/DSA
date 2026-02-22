package Array;

import java.util.*;

public class MountainsAndValley {
    public static int isMountainValleyPattern(int[] arr) {
        int n = arr.length;

        if (n == 1)
            return 1;

        int prev = arr[1] - arr[0];

        for (int i = 2; i < n; i++) {
            int curr = arr[i] - arr[i - 1];
            if (prev * curr >= 0) { // same direction or zero
                return 0;
            }
            prev = curr;
        }
        return 1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int result = isMountainValleyPattern(arr);
        System.out.println(result);

        scanner.close();
    }
}
