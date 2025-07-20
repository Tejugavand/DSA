import java.util.Scanner;

public class reverse1 {
    public static void main(String args[]){
        
        int i;

        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        sc.close();

        while(n>0){
            int rem=n%10;
            System.out.println(rem);

            n=n/10;

        }
        



    
}
}
