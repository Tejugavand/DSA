public class pattern11 {
    public static void main(String[] args) {
        int n=9;
        int m=(n/2)+1;

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==1 && j>=m ){
                    System.out.print(" * ");
                }
                else if(j==m ||i==m){
                    System.out.print(" * ");
                }
                else if(i==n &&j<=m){
                    System.out.print(" * ");
                }
                else if(j==1 &&i<=m){
                    System.out.print(" * ");
                }
                else if(j==n &&i>=m){
                    System.out.print(" * ");
                }
            else{
                System.out.print("   ");
            }
        }System.out.println();
    }
    
}
}
