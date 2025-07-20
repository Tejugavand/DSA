import java.util.Scanner;

public class whileloopharshad {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        n = sc.nextInt();
        sc.close();
        int sum=0;

        while(n>0){
            int rem=n%10;
            System.out.println(rem +" " );
            
            sum=sum+rem;

            n=n/10;
        }
        System.out.println("sum is");
        System.out.println(sum);

        if(n%sum==0){
                System.out.println("harshad number");
            }

            else{
                System.out.println("not harshad number");


            }
        
    
}
}
