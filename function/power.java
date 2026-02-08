package function;

import java.util.Scanner;

public class power {
    public static int num(int base,int exponant){
        int power=1;

        System.out.println("power");
        for (int i=1; i<=exponant; i++){
            power =base*power;
            System.out.println(power);

            }
            return power;
        }

        public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the base");
        int base = sc.nextInt();
        System.out.println("enter the exponant");
        int exponant= sc.nextInt();

        int power1=num(base,exponant);
        System.out.println("power is" +power1);
        sc.close();
}
}
