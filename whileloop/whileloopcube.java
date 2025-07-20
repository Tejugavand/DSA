import java.util.Scanner;

public class whileloopcube {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        n = sc.nextInt();
        sc.close();
        int sum=0;
        int cube=0;
        System.out.println("reverse number:");
        while(n>0){
            int rem=n%10;
            System.out.print(rem +" " );
            
            cube=rem*rem*rem;
                System.out.println( "= " + cube);
                sum=sum+cube;

            
                //int cube=rem*rem*rem;
                //System.out.println( + rem + "=" + cube);
            

            n=n/10;
                
                


            
        }
        System.out.println(sum);
        
    }
    
}
