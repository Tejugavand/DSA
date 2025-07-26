package function;
import java.util.Scanner;

public class strongnumber {
    public static int num(int n){
        int factorial=1;
        int i;
        int sum=0;
        while(n>=0){
            int rem=n%10;
            System.out.println(rem +" " );
            sum=sum+num(rem);

            n=n/10;
        }
        return sum;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();

        int factor=num(n);
        int sum=num(n);
        
        
    }
    
}
