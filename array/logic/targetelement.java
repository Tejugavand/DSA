import java.util.Arrays;
import java.util.Scanner;

public class targetelement {

    public static void findPairWithTarget(int[] arr, int target) {
        int i = 0, j = arr.length - 1;
        boolean found = false;

        while (i < j) {
            int sum = arr[i] + arr[j];

            if (sum == target) {
                System.out.println("Found pair: " + arr[i] + ", " + arr[j]);
                found = true;
                break;
            } else if (sum < target) {
                i++;
            } else {
                j--;
            }
        }

        if (!found) {
            System.out.println("No pair found with sum = " + target);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        if (n < 2) {
            System.out.println("Array should have at least 2 elements");
            sc.close();
            return;
        }

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter target sum: ");
        int target = sc.nextInt();

        Arrays.sort(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));

        findPairWithTarget(arr, target);
        sc.close();
    }
}
