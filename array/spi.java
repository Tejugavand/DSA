package array;

import java.util.Scanner;

public class spi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = 5;
        int[] arr = new int[size];

        
        for (int i = 0; i < size; i++) {
            System.out.print("Enter number: ");
            arr[i] = sc.nextInt();
        }

        System.out.println("\nHarshad numbers in the array:");

        boolean found = false;

        
        for (int num : arr) {
            int mult=0;
            int sum = 0;
            int n = num;

            
             while(n>0){
            int rem=n%10;
            
            sum=rem+sum;
            mult=rem*mult;
            
            n=n/10;
        }

            
            if (sum == mult) {
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

    
