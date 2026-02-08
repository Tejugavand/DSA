package function;

import java.util.Scanner;

public class rangepalindrom {
    public static int palindomnumber(int a){
        int reverse=0;
        while(a>0){
            int rem=a%10;
            reverse=reverse*10+rem;

            a=a/10;
        }
        return reverse;
        
    }
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter start Number: ");
        int start = sc.nextInt();
        System.out.print("Enter end Number: ");
        int end = sc.nextInt();
        sc.close();
        for (int i = start; i <= end; i++){
        int reverse=palindomnumber(i);
        
        if(i==reverse){
                System.out.println(i+ ": palindrom number");
            }

            else{
                System.out.println(i+ ": not palindom number");


            }
    
}
    }
}


    
