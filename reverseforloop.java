import java.util.Scanner;

public class reverseforloop {
    public static void main(String[] args){
        
        int i;

    
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the i:");
        i = sc.nextInt();
        

        for (i=10; i>=1;i--){
            System.out.println(i);
            sc.close();
        }

    
}
}
    

