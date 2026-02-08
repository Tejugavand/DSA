package recursion;

import java.util.Scanner;

public class spy {
    public static int[] isspy(int num, int sum, int mult) {
        if (num == 0) {
            return new int[] { sum, mult };
        }
        int rem = num % 10;
        sum =sum+ rem;
        mult =mult* rem;
        return isspy(num/10, sum, mult);
    }
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter start Number: ");
        int num = sc.nextInt();
        int[] result = isspy(num, 0, 1);
        int sum = result[0];
        int mult = result[1];

        isspy( num, 0,1);
        if(sum==mult){
            System.out.println( "spy number");
        }
        else{
            System.out.println("not spy number");
        }
        sc.close();
}
}
