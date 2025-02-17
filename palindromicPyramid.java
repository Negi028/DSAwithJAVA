public class palindromicPyramid {
    public static void main(String[] args) {
        for(int row=1;row<=5;row++){
            for(int space=1;space<=5-row;space++){
                System.out.print(" ");
            }
            //for first half back traverse 
            for(int col=row;col>=1;col--){
                System.out.print(col);

            }
            //second half forward track
            for(int col2=2;col2<=row;col2++){
                System.out.print(col2);
            }
            System.out.println();
            

        }
    }
}
