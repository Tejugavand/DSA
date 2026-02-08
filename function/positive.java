package function;

import java.util.Scanner;

public class positive {
    public static boolean num(double a){
        return a>=0;
    }

    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        int a=sc.nextInt();

        boolean positive=num(a);
        System.out.println("number is possitive:"  +positive);
        sc.close();
        
    }
    
}
