import java.util.Scanner;

public class forloopfactorsum {
    public static void main(String args[]){
        
        int i;
        int n;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        n = sc.nextInt();
        sc.close();
        int sum=0;
        System.out.println("sum of factor");
        for (i=1; i<n; i++){
            if(n%i==0){
                        sum=sum+i;
            }

        
            }

            System.out.println(sum);

            if(n==sum){
                System.out.println("perfect number");
            }

            else{
                System.out.println("not perfect number");


            }
            
        }
                


    
}
