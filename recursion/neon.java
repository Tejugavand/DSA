package recursion;

import java.util.Scanner;

public class neon {
    public static int isneon(int square, int sum) {
        if (square == 0) { 
            
            return sum;
        }
        int rem = square % 10;
        sum += rem;
        return isneon(square / 10, sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        sc.close();

        int square = n * n;
        int sum = isneon(square, 0);

        if (sum == n) {
            System.out.println("Neon Number");
        } else {
            System.out.println("Not Neon Number");
        }
    }
}
