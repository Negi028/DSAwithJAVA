public class butterfly {
    public static void main(String[] args) {
        for(int row=1;row<=4;row++){
            for(int col=1;col<=row;col++){
                System.out.print("*");
            }
            for(int space=1;space<=2*(4-row);space++){
                System.out.print(" ");
            }
            for(int col=1;col<=row;col++){
                System.out.print("*");
            }
            System.out.println();
           
        }
        for(int row2=4;row2>=1;row2--){
            for(int col=1;col<=row2;col++){
                System.out.print("*");
            }
            for(int space2=1;space2<=2*(4-row2);space2++){
                System.out.print(" ");
            }
            for(int col=1;col<=row2;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
