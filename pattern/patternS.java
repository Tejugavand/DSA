public class patternS {
    public static void main(String[] args) {
        int n=5;
        int p=3;
        int m=(n/2)+1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=p;j++){
                if(i==m||i==1&&j<=3||j==1){
                    System.out.print(" * ");
                }
                else{
                    System.out.print("   ");
                }
            }System.out.println();
        }
    }
    
}
