package function;
import java.util.Scanner;

public class strongnumber {
    public static int factorial(int n){
        int factorial=1;
        int i;
        for (i=1; i<=n; i++){
            factorial=factorial*i;
            }
            return factorial;
    }
    public static int isStrong(int n){
    
        int sum=0;
        
        while(n>0){
            int rem=n%10;
        
            sum=sum+factorial(rem);

            n=n/10;
        }
        return sum;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        int sum=isStrong(n);
        if(n==sum){
            System.out.println(sum+ ":strong number");
        }
        else{
            System.out.println(sum+ ":not strong number");
            sc.close();
        }
    }
    
}
