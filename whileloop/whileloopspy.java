import java.util.Scanner;

public class whileloopspy {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        n = sc.nextInt();
        sc.close();
        int sum=0;
        int mult=1;
        while(n>0){

            int rem=n%10;
            System.out.print(rem +" " );
            
            sum=rem+sum;

            mult=rem*mult;
            n=n/10;
        }
        System.out.println(sum);

        System.out.println(mult);

        

        if(sum==mult){
                System.out.println("spy number");
            }

            else{
                System.out.println("not spy number");


            }
    
    
}
}
