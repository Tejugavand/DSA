package function;

import java.util.Scanner;

public class factorialofnumber {
    public static int factorial(int n){
        int factorial=1;
        int i;
        for (i=1; i<=n; i++){
            factorial=factorial*i;
            }
            return factorial;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        int n=sc.nextInt();

        int result=factorial(n);
        System.out.println("number is :" +result);
    }
    }

