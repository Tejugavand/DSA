package array;

import java.util.Scanner;

public class functionharshadh {
    public static int isharshad(int n){
        int sum=0;
        int size = 5;
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter number: ");
        
        }

        while(n>0){
            int rem=n%10;
            System.out.println(rem +" " );
            
            sum=sum+rem;
        n=n/10;
        }
        return sum;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        int n=sc.nextInt();
        int sum=isharshad(n);

        if(n%sum==0){
                System.out.println("harshad number");
            }

            else{
                System.out.println("not harshad number");


            }

    }
    
}
