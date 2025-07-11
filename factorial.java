import java.util.Scanner;

public class factorial {
    public static void main(String args[]){
        int n;
        int i;
        

    
        Scanner sc = new Scanner(System.in);
    
        System.out.println("enter the number");
        n= sc.nextInt();

        
        
        int factorial=1;
        System.out.println("total count");
        for (i=1; i<=n; i++){
            factorial =factorial*i;
            
                sc.close();
            
        }
                System.out.println(factorial);


    
}
}
