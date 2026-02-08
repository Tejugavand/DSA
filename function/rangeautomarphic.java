package function;

import java.util.Scanner;

public class rangeautomarphic {
    public static boolean isAutomorphic(int n) {
        int square = n * n;
        while (n > 0) {
            if (n % 10 != square % 10) {
                return false;  
            }
            n =n/ 10;
            square = square/10;
        }
        return true;  
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter start Number: ");
        int start = sc.nextInt();
        System.out.print("Enter end Number: ");
        int end = sc.nextInt();
        sc.close();

        System.out.println("Automorphic numbers in the range:");
        for (int i = start; i <= end; i++) {
            if (isAutomorphic(i)) {
                System.out.println(i + " is automorphic");
            } else {
                System.out.println(i + " is nOt automorphic");
            }
        }
    }
}
