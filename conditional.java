import java.util.Scanner;
public class conditional {
    public static void main(String[] args){
        int marathi ;
        int english ;
        int math ; 
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks:");
        marathi = sc.nextInt();

        System.out.println("Enter the marks:");
        english = sc.nextInt();

        System.out.println("Enter the marks:");
        math = sc.nextInt();


        
        int total=marathi+ english+ math;

        int per = total/ 3;
        System.out.println(total);
        System.out.println(per);

        if (per >=40){
            System.out.println("pass");
        }


        else{
            System.out.println("fail");
        }
        sc.close();
    }
    

    
}
