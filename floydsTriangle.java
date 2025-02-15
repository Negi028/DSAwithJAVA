public class floydsTriangle {
    public static void main(String[] args) {
        int increment=1;
        for(int row=1;row<=5;row++){
            for(int col=1;col<=row;col++){
                
                System.out.print(increment+" ");
                increment++;

            }
            System.out.println();
        }
    }
}
