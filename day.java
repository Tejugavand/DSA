import java.util.Scanner;



public class day {
    public static void main(String[] args) {

        int day = 3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day:");
        day = sc.nextInt();

        if (day == 1) {
            System.out.println("sunday");

        }
        
        else if (day == 2) {
            System.out.println("monday");
        }

        else if (day ==3){
            System.out.println("thu");
        }

        else if (day ==4){
            System.out.println("wed");
        }

        else if (day ==5){
            System.out.println("thu");
        }

        else if (day ==6){
            System.out.println("fri");
        }

        else if (day ==7){
            System.out.println("sat");
        }
        else{
            System.out.println("invalid");
        }
        sc.close();

    }
}
