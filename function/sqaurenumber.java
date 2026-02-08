package function;
import java.util.Scanner;


public class sqaurenumber {
    public static int num(int a){
        return a*a;
    }

    public static int num1(int a){
        return a*a*a;
    }



    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        int a=sc.nextInt();
        

        int square=num(a);
        System.out.println("area of square:" +square);

        int cube=num1(a);
        System.out.println("area of cube:" +cube);
        sc.close();

        
    }
    
}
