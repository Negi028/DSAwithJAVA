public class holl3Pattern {
    public static void main(String[] args) {
        int n=5;
        for(int row=1;row<=n;row++){
            for(int space=1;space<=n-row;space++){
                System.out.print(" ");
            }
            int odd=2*row-1;
            for(int col=1;col<=odd;col++){
                System.out.print("*");
            }
            System.out.println();
            


        }
    }
}
