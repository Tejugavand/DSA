import java.util.Scanner;

public class forloopbreak {
    public static void main(String[] args){
        int start,end;
        int i;

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the start");
        start = sc.nextInt();

        System.out.println("enter the end");
        end= sc.nextInt();
        

        for(i=start;i<=end;i++){
            if(i==1){
                continue;
            }
        System.out.println(i);
}
    }
}
