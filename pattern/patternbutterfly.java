public class patternbutterfly {
    public static void main(String[] args) {
        int n=5;
        //outer
        for(int i=1;i<=n;i++){
            //1st part
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }

            //space
            int s=2*(n-i);
            for(int j=1;j<=s;j++){
                System.out.print(" ");

            }

            //2nd part
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //lower half

        for(int i=n;i>=1;i--){
            //1st part
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }

            //space
            int s=2*(n-i);
            for(int j=1;j<=s;j++){
                System.out.print(" ");

            }

            //2nd part
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }


    }
    
}

