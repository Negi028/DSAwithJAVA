public class invertPyramid {
    public static void main(String[] args) {
        for(int row=1;row<=4;row++){
            //for space 3spaces ,2 spaces ,1 spaces ,0 spaces
            for(int space=1;space<=4-row;space++){
                System.out.print(" ");
            }
            //for star print 1star ,2 ,3 ,4 
            for(int col=1;col<=row;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
