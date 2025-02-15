public class invertNOpyramid {
    public static void main(String[] args) {
        for(int row=5;row>=1;row--){
            for(int col=1;col<=row;col++){
                System.out.print(col);
            }
            System.out.println();
        }
    }
}
