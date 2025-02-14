public class hollPattern {
    public static void main(String[] args) {
        int n=5;
        for(int row=1;row<=n;row++){
            for(int col=1;col<=row;col++){
                if(row==n||col==1||row==col){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
               

            }
            System.out.println();
         
        }
    }
}
