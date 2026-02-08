package recursion;

import java.util.Scanner;

public class factorial {
public static int isfact(int i,int fact){
        if(i==1){
            return fact;
        }
        fact=fact*i;
        return isfact(i-1,fact);
    }    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter start Number: ");
        int i = sc.nextInt();
        int factorial=isfact(i,1);
        System.out.println( "factorial is: " +factorial);
    }
    
}
