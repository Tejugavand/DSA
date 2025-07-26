package function;

import java.util.Scanner;

public class evennumber {
    public static boolean num(int a){
        return a%2==0;
    }

    public static boolean num1(int a){
        return a%2!=0;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        int a=sc.nextInt();
        

        boolean even=num(a);
        System.out.println("number is even:" +even);

        boolean odd=num1(a);
        System.out.println("number is odd:" +odd);


    
}
}