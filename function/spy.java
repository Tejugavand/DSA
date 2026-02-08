package function;

import java.util.Scanner;

public class spy {
    public static int isspy(int n){
        int sum=0;
        int mult=1;
        while(n>0){
            int rem=n%10;
            //System.out.print(rem +" " );
            sum=rem+sum;
            mult=rem*mult;
            
            n=n/10;
        }
        return sum;
    }
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        int sum=isspy(n);
        int mult=isspy(n);
        if(sum==mult){
            System.out.println( "spy number");
        }
        else{
            System.out.println("not spy number");
        }
        sc.close();
    
}
}
