import java.util.Scanner;

public class digit {
    public static void main(String[] args){
        int a ;
    
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num:");
        a = sc.nextInt();

        
        if(a>=-9 && a <=9){
            System.out.println("a is digit");
        }

        else{
            System.out.println("a is number");
        }
        sc.close();


    
}
}
