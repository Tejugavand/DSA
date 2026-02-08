import java.util.Scanner;
import java.lang.String;
public class controlstatement1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the name:");

        String name=sc.next();

        if(name.length()<3||name.length()>15){
            System.out.println("the chacter should be with in limits");
            return;
        }
        System.out.println("name is correct....");

        System.out.println("enter the pssword ");

        int password=sc.nextInt();
        if(password.length()<8);{
            System.out.println("enter the coorect pssword:");
            return;
        }System.out.println("paaword is failed");

    }
    
}
