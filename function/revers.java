package function;

import java.util.Scanner;

public class revers {
    public static int isrevers(int n){
        while(n>0){
            int rem=n%10;
            System.out.println(rem);

            n=n/10;
    }
    
    
}
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        sc.close();
        n=isrevers(n);
}
}

