public class patternW {

    public static void main(String[] args) {
        int n=5;
        int m=(n/2)+1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(j==1 ||j==n ){
                    System.out.print(" * ");
                }
                else if(i>=m && j==i &&j>=m){
                    System.out.print(" * ");
                }
                else if(i>=m && j==(n-i+1) &&j<=m){
                    System.out.print(" * ");
                }
                
                else {
                    System.out.print ("   ");
                }
            }System.out.println();
        }
    }
    
    }
    


        