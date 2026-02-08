package recursion;

import java.util.Scanner;

public class harshad {
    public static int isharshad(int n,int sum){
        if(n==0){
            return sum;
        }
        int rem=n%10;
            System.out.println(rem +" " );
            
            sum=sum+rem;
        n=n/10;
        return isharshad(n, sum);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        int n=sc.nextInt();
        int sum=isharshad(n,0);

        if(n%sum==0){
                System.out.println("harshad number");
            }

            else{
                System.out.println("not harshad number");


            }

    }
    
}
