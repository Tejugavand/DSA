import java.util.Scanner;

public class whileloopamstrog {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        n = sc.nextInt();
        sc.close();
        int sum=0;
        int cube=0;
        int temp=n;
        System.out.println("reverse number:");
        while(n>0){
            int rem=n%10;
            System.out.print(rem +" " );
            
            cube=rem*rem*rem;
                System.out.println( "= " + cube);
                sum=sum+cube;
            

            n=n/10;
                
            }
            System.out.println(sum);

            if(temp==sum){
                System.out.println("amstrog number");
            }

            else{
                System.out.println("not amstrog number");


            }
        
    }
    
}

    
