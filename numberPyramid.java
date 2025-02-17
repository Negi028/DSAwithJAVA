public class numberPyramid {
    public static void main(String[] args) {
        for(int row=1;row<=5;row++){
            for(int spaces=1;spaces<=5-row;spaces++){
                System.out.print(" ");
            }
            for(int col=1;col<=row;col++){
                System.out.print(row+" ");
            }
            System.out.println();
        }
    }
}
