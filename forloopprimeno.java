import java.util.Scanner;

public class forloopprimeno {
    public static void main(String args[]){
        int n;
        int i;
        Scanner sc = new Scanner(System.in);
    
        System.out.println("enter the number");
        n= sc.nextInt();
        for(i=2;i<n;i++){
            
            if(n%i==0){
                //System.out.println("not prime ");
                continue;
            }
            else{
                System.out.println("prime");
            }
        }
        System.out.println();
        
        
    
}
}