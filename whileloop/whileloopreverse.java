import java.util.Scanner;
public class whileloopreverse {
    public static void main(String[] args) {
        int n;
        int reverse=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        n=sc.nextInt();
        

        while(n>0){
            int rem=n%10;
            reverse=reverse*10+rem;

            n=n/10;
        }
        System.out.println("reverse number");
        System.out.println(reverse);
        
    }
    
}
