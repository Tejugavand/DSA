import java.util.Scanner;

public class forloopodd {
    public static void main(String[] args){
        
        int i;

    
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the i:");
        i = sc.nextInt();
        
        System.out.println("odd number");
        for (i=1; i<=10; i++){
            if(i%2!=0){
                System.out.println(i);
                sc.close();
            }
            
        }

        
        sc.close();
    
}
    
}
