package function;

import java.util.Scanner;

public class automarphic {
    public static int isAutomorphic(int n) {
        int square = n * n;
        int flag = 0;
        int rem=1;

        while(n>0){
            rem=n%10;
            if(rem!=square%10){
                flag=1;
                break;
            }
            n =n/ 10;
            
        }
        return flag;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        sc.close();

        int flag = isAutomorphic(n);
        if (flag == 0) {
            System.out.println("Automorphic number");
        } else {
            System.out.println("Not an Automorphic number");
        }
    }
}
