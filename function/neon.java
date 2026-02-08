package function;

import java.util.Scanner;

public class neon {
    public static int isneon(int n){
        int sum=0;
        int square=1;
        

        while(n>0){
        int rem=n%10;
            System.out.println(square +" " );

            rem=n*n;
            sum=sum+rem;
            
            n=n/10;
        }
        return sum;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        int temp=n;
        int sum=isneon(n);
        if(temp==sum){
                System.out.println("neaon number");
            }

            else{
                System.out.println("not neaon number");


            }
    }
    
}
