import java.util.Scanner;

public class neaon {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        n = sc.nextInt();
        sc.close();
        int sum=0;
    
        int square=n*n;
        System.out.println("square is");
        System.out.println(square);

        while(square>0){
            int rem=square%10;
            System.out.println(rem +" " );
            
            sum=sum+rem;
            

            square/=10;

            
        }
        System.out.println("sum is");
        System.out.println(sum);
        
        
        
        if(sum==n){
                System.out.println("neaon number");
            }

            else{
                System.out.println("not neaon number");


            }
        
    
}
}
