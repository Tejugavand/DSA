import java.util.Scanner;

public class forloopfactor {
    public static void main(String args[]){
        
        int i;
        int n;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        n = sc.nextInt();
        sc.close();
        
        System.out.println("factor");
        for (i=1; i<n; i++){
            if(n%i==0){
                System.out.println(i);
            }
            
            
            }
            
        }
                


    
}

    

