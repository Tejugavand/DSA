import java.util.Scanner;

public class whilelooppalindom {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        n=sc.nextInt();
        
        int reverse=0;
        int temp=n;
        while(n>0){
            int rem=n%10;
            reverse=reverse*10+rem;

            n=n/10;
        }
        System.out.println("reverse number");
        System.out.println(reverse);
        
        if(temp==reverse){
                System.out.println("palindrom number");
            }

            else{
                System.out.println("not palindom number");


            }
    }
    
}

