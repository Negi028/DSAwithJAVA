public class mazePath{
    static void possiblePath(int row,int col,int endRow,int endCol,String result){
        if(row==endRow&&col==endCol){
            System.out.println(result);
        }
        if(row>endRow||col>endCol){
            return;
        }
        //move horizontally
        possiblePath(row, col+1, endRow, endCol, result+"H");
        //move vertically
        possiblePath(row+1, col, endRow, endCol, result+"V");
    }
    public static void main(String[] args) {
        possiblePath(0, 0,2 , 2, "");
    }
}