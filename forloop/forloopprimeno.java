import java.util.Scanner;

public class forloopprimeno {
    public static void main(String args[]){
        int n;
        int i;
        Scanner sc = new Scanner(System.in);
    
        System.out.println("enter the number");
        n= sc.nextInt();
        int sum=0;
        for(i=1;i<n;i++){
            if(n%i==0){
                sum++;

            }
        }
        if(sum==2){
            System.out.println("prime number");
        }
        else{
            System.out.println("not prime number");
        }

        


            
            }
}
