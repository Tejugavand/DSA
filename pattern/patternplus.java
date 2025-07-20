public class patternplus {
    public static void main(String[] args) {
        
        int n=8;
        int m=(n/2)+1;
        for ( int i=0;i<n;i++){
            for(int j=0;j<n;j++)
                if(i==m || j==m ){
                System.out.print(" * ");
                }
                else if(i==m && j==m){
                    System.out.print(" * ");
                }
                else{
                System.out.print("   ");
                }
        System.out.println();
        
    }
    
    
}
}

