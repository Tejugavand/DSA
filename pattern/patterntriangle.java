public class patterntriangle {
    public static void main(String[] args) {
        int n=5;
        int m=(n/2)+1;

        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }System.out.println();
            }

        }
    }
    
