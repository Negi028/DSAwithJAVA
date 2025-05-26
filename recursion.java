public class recursion {
    static void printName(int num){
        //base case or termination case
        if(num==0){
            return;
        }
        System.out.println("Akash");
        printName(num-1);
    }
    public static void main(String[] args) {
        printName(5);
        
    }
}
