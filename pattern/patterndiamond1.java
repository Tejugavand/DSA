public class patterndiamond1 {
    public static void main(String[] args) {
        int n=5;
        int m=n/2;
        for ( int i=0;i<n;i++){
            for(int j=0;j<n;j++)
                if(i==m || j==m ){
                System.out.print(" * ");
                }
                else if(i>=m-1&&j<=m-1){
                    System.out.print(" * ");
                }
                else{
                System.out.print("   ");
                }
        System.out.println();
        
    }
    
}
}

