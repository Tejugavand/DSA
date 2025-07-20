import java.util.Scanner;

public class power {
    public static void main(String args[]){
        int base,exponant;
        int i;
        
    
        

    
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the base");
        base = sc.nextInt();
        System.out.println("enter the exponant");
        exponant= sc.nextInt();
        
        
        int power=1;
        System.out.println("power");
        for (i=1; i<=exponant; i++){
            power =base*power;
            
                sc.close();
            
        }
                System.out.println(power);


    
}
}

    

