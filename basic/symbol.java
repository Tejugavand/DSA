import java.util.Scanner;

public class symbol {
    public static void main(String[] args){
        char alpha ;
    
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the alpha:");
        alpha = sc.next().charAt(0);

        
        if(alpha>='a' && alpha<'z'){
            System.out.println("it is  alphbet");
        }

        else if(alpha>='A' && alpha<'Z'){
            System.out.println("it is  alphbet");
        }

        else if(alpha<=-9 && alpha <=9){
            System.out.println("a is digit");
        }

        



        else{
            System.out.println("it is symbol");
        }
        sc.close();
    
}
}
