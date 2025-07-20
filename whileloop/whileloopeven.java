import java.util.Scanner;

public class whileloopeven {
    public static void main(String args[]){
        
        int n;

        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        n = sc.nextInt();
        sc.close();
        int sum=0;
        
        System.out.println("reverse number");
        while(n>0){
            int rem=n%10;
            System.out.println(rem);

            n=n/10;
            if(rem %2==0){
                sum=sum+rem;
                
        
            }
            }
            System.out.println("total count of even number");
        
            System.out.println(sum);


        
    
    
}
}
        
