import java.util.Scanner;

public class whilereverse {
    public static void main(String args[]){
        
        int n;

        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        n = sc.nextInt();
        sc.close();


        while(n>0){
            int rem=n%10;
            System.out.println(rem);

            n=n/10;
        

}
        
    }
}
        



    



    
