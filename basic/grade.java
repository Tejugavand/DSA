import java.util.Scanner;

public class grade {
    public static void main(String[] args){
        double math;
        double oop;
        double chem;
        double phy;
        double dsbda;
    
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of math:");
        math = sc.nextInt();

        System.out.println("Enter the marks of oop:");
        oop = sc.nextInt();

        System.out.println("Enter the marks of chem:");
        chem = sc.nextInt();

        System.out.println("Enter the marks of phy:");
        phy = sc.nextInt();

        System.out.println("Enter the marks of dsbda:");
        dsbda = sc.nextInt();

        double total= math + oop + chem + phy + dsbda;

        double per = total/ 5;
        System.out.println(total);
        System.out.println(per);

        if (per>90 && per<=100){
            System.out.println("O");
        }

        else if (per>80 && per<=90){
            System.out.println("A+");
        }

        else if (per>70 && per<=80){
            System.out.println("A");
        }

        else if (per>=60 && per<=70){
            System.out.println("B+");
        }

        else if (per>=50 && per<=60){
            System.out.println("B");
        }

        


        else{
            System.out.println("fail");
        }

        sc.close();
    
}
}
