public class holl2pattern {
    public static void main(String[] args) {
        int n=5;
        for(int row=1;row<=n;row++){
            for(int col=1;col<=n-row+1;col++){
                if(row==1||col==1||col==n-row+1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
