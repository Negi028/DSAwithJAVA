public class zeroOrOnepyramid {
    public static void main(String[] args) {
        for(int row=1;row<=5;row++){
            for(int col=1;col<=row;col++){
                int sum=row+col;
                if(sum%2==0){
                    System.out.print("1"+" ");
                }else{
                    System.out.print("0"+" ");
                }
            }
            System.out.println();
        }
    }
}
