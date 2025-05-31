public class PatternRecursion{
    static void printStar(int stars){
        if(stars==0){
            return;
        }
        System.out.print("*");
        printStar(stars-1);
    }
    static void printLines(int lines){
        if(lines==0){
            return;
        }
        printLines(lines-1);
        printStar(lines);
        System.out.println();
        
    }
    public static void main(String[] args) {
        int lines =5;
        printLines(lines);
        
    }
}