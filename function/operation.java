package function;

public class operation {
    public static int add(int a,int b){
        return a+b;
        }

    public static int diff(int a,int b){
        return a-b;
        }

    public static int mult(int a,int b){
        return a*b;
        }

    public static int div(int a,int b){
        return a/b;
    }
    public static void main(String[] args) {
        int sum=add(10,20);
        System.out.println("sum is :" +sum);

        int diff=diff(20,10);
        System.out.println("substaction is:" +diff);

        int mult=mult(10,20);
        System.out.println("mult is :" +mult);
        
        int div=div(10,2);
        System.out.println("division is :" +div);
        
        
        
        
    }
    
}
