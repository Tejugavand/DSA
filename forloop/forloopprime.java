import java.util.Scanner;

public class forloopprime {
    public static void main(String args[]){
        int n=0;
        int start,end;

        Scanner sc =new Scanner(System.in);
    

        System.out.println("enter the start number");
        start=sc.nextInt();

        System.out.println("enter the end");
        end=sc.nextInt();
        int sum=0;
        for(int i=start;i<=end;i++){
            if(sum%i==0){
                sum++;
            }

        
        }
        if(sum==2){
            System.out.println(sum);
        }
        else{
            System.out.println("not prime");
        }
        
        
    }
    
}
