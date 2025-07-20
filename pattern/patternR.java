public class patternR {
    public static void main(String[] args) {
        int n=5;
        int p=3;
        int m=(n/2)+1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=p;j++){
                if(j==1||i==1||i==3||j==p &&i==2||j==2&&i==4 ||j==3&&i==5){
                    System.out.print(" * ");
                }
                //else if(j==m+i-1){
                    //System.out.print("*");
                //}
                else{
                    System.out.print("   ");
                }
            }System.out.println();
        }
    }
    
}
    
