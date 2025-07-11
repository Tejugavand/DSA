import java.util.Scanner;
public class controlstatement {
    public static void main(String[] args) {
        int num =789;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");

        num =sc.nextInt();

            if (num % 2==0){
                System.out.println("tne number is even");
            }else{
                System.out.println("the number is odd");

            }

            int number =2311;
            if (number >=0){
                System.out.println("the number is positive");


            }else{
                System.out.println("the number is negativ");
            }

            int number1 =-2311;
            if (number1 >=0){
                System.out.println("the number is positive");


            }else{
                System.out.println("the number is negativ");
            }

        sc.close();

        
    
    }
    
}
