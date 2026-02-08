package dsa.array;
import java.util.Scanner;
import java.util.Arrays;

public class sea {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the array size:");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements:");
        for(int i = 0; i < n; i++) {
            int x = sc.nextInt();
            arr[i] = x * x * x;   // storing cube
        }

        System.out.println("The array of cubes is: " + Arrays.toString(arr));

        sc.close();
    }
}
