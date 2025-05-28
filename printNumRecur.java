public class printNumRecur{
    static void printNumber(int num){
        if(num==0){
            return;
        }
        printNumber(num/10);//make small problem
        System.out.println(num%10);//post processing
    }
    public static void main(String[] args) {
        printNumber(12345);
    }
}