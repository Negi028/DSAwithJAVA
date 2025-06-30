public class DiceProbTreeRec {
    static void boardProblem(int currValue, int endValue, String result){
        //base case
        if(currValue==endValue){
            System.out.print(result+" ,");
            return;
        }
        //negative case, no contribution
        if(currValue>endValue){
            return;
        }
        //small problem
        for(int dice=1;dice<=6;dice++){
        boardProblem(currValue+dice, endValue, result+dice);}


    }
    public static void main(String[] args) {
        boardProblem(0, 10, "");
    }
}
