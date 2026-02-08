package function;

import java.util.Scanner;

public class rangeamstrong {

    public static boolean isArmstrong(int n) {
        int sum = 0;
        int temp = n;

        while (n > 0) {
            int rem = n % 10;
            sum += rem * rem * rem;
            n =n/ 10;
        }

        return sum == temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter start Number: ");
        int start = sc.nextInt();
        System.out.print("Enter end Number: ");
        int end = sc.nextInt();
        sc.close();

        System.out.println("Armstrong numbers in the range:");
        for (int i = start; i <= end; i++) {
            if (isArmstrong(i)) {
                System.out.println(i + " is an Armstrong number");
            }
            else{
                System.out.println(i + " not amstrong");
            }
        }
    }
}
