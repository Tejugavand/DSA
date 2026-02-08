package function;

import java.util.Scanner;

public class palindrom {
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
    
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int a=sc.nextInt();
        int reverse=palindomnumber(a);
        if(a==reverse){
                System.out.println("palindrom number");
            }

            else{
                System.out.println("not palindom number");


            }
    
}
}
