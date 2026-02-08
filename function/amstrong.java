package function;

import java.util.Scanner;

public class amstrong {
    
    public static int isamstrong(int n){
    
        int sum=0;
        int cube=0;
        
        while(n>0){
            int rem=n%10;
            System.out.print(rem +" " );
            
            cube=rem*rem*rem;
                System.out.println( "= " + cube);
                sum=sum+cube;
            

            n=n/10;
                
            }
            return sum;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        int sum=isamstrong(n);
        if(n==sum){
            System.out.println(sum+ ":amstrong number");
        }
        else{
            System.out.println(sum+ ":not amstrong number");
        }
    

    


        
        
    }
    
}

    

