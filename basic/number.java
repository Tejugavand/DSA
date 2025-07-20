import java.util.Scanner;

public class number {
    public static void main(String[] args){
        int a ;
        int b ;
        int c ; 
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num:");
        a = sc.nextInt();

        System.out.println("Enter the num:");
        b = sc.nextInt();

        System.out.println("Enter the num:");
        c = sc.nextInt();

        if(a>=b &&a>=c){
            System.out.println("a is grater than b&c");
        }

        
        else if(b>=a && b>=c){
            System.out.println("b is grater than a&c");
        }

        
        else{
            System.out.println("c is grater");
        }
        sc.close();

}
}

