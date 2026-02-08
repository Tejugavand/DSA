package array;

import java.util.Scanner;

public class amstrong {

    public static void main(String[] args) {
        int size = 5;
        int[] arr = new int[size];
        Scanner sc = new Scanner(System.in);

        
        for (int i = 0; i < size; i++) {
            System.out.print("Enter array number: ");
            arr[i] = sc.nextInt();
        }

        System.out.println("Armstrong numbers in the array:");

        boolean found = false;  //cheak

        //Check each number and print  Armstrong numbers
        for (int num : arr) {
            int n = num;
            int sum = 0;

            while (n > 0) {
                int rem = n % 10;
                sum += rem * rem * rem;
                n /= 10;
            }

            if (sum == num) {
                System.out.print(num + " ");
                found = true;
            }
        }

        if (!found) {
            System.out.println("None");
        }

        sc.close();
    }
}
