import java.util.Scanner;

public class switch1 {
    public static void main(String[] args){
        int a ;
        int b;
        char ch;
    
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the a:");
        a = sc.nextInt();

        System.out.println("Enter the b:");
        b = sc.nextInt();

        System.out.println("Enter the operator:");
        ch = sc.next().charAt(0);

        switch(ch){
            case '+':System.out.println(a+b);
            break;

            case '-':System.out.println(a-b);
            break;

            case '*':System.out.println(a*b);
            break;

            case '/':System.out.println(a/b);
            break;

            case '%':System.out.println(a%b);
            break;

            default :System.out.println("invalid");

        }
        sc.close();
    
}
}
