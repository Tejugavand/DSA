import java.util.Scanner;

public class upper {
    public static void main(String[] args){
        char alpha ;
    
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the alpha:");
        alpha = sc.next().charAt(0);

        
        if(alpha>='a' && alpha<'z'){
            System.out.println("it is lower case");
        }

        else {
            System.out.println("it is uppercase");
        }
        sc.close();

    
}
}
