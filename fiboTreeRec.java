//fibonacci seriess means sum of first and second term equals to third term: f(0)=0,f(1)=1,f(2)=0+1=1
public class fiboTreeRec {
    static int fibo(int num){
        if(num<=1){
            return num;
        }
        int firstNum=fibo(num-1);
        int secondNum=fibo(num-2);
        return firstNum+secondNum;
    }
    public static void main(String[] args) {
        int result=fibo(8);
        System.out.println("result of 8th term is "+result);
    }
}
