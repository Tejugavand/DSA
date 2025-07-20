import java.util.Scanner;

public class whileloopneon {
    public static void main(String[] args) {
        int n;

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        n = sc.nextInt();
        sc.close();
        int sum=0;
        int square=1;
        int temp=n;

        while(n>0){
        int rem=n%10;
            System.out.println(square +" " );

            rem=n*n;
            sum=sum+rem;

            n=n/10;
        }
        System.out.println("sum is");
        System.out.println(sum);

        if(temp==sum){
                System.out.println("neaon number");
            }

            else{
                System.out.println("not neaon number");


            }
        
    
}
}

    