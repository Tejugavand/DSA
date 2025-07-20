import java.util.Scanner;

public class operator {
    public static void main(String[] args){
        int a ;
        int b;
        char c;
    
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the a:");
        a = sc.nextInt();

        System.out.println("Enter the b:");
        b = sc.nextInt();

        System.out.println("Enter the operator:");
        c = sc.next().charAt(0);


        if(c =='+'){
            System.out.println(a+b);

        }

        else if(c=='-'){
            System.out.println(a-b);
        }

        else if(c=='*'){
            System.out.println(a*b);
        }

        else if(c=='/'){
            System.out.println(a/b);
        }

        else if(c=='%'){
            System.out.println(a/b);
        }

        else{
            System.out.println("invalid");
        }

        sc.close();




    
    
}
}
