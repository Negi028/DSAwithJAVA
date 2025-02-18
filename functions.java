
import java.util.Scanner;

public class functions {
    public static int addNum(int a, int b){
        int sum=a+b;
        return sum;

    }
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int a= input.nextInt();
        int b=input.nextInt();
        int sum=addNum(a, b);
        System.out.println(sum);
        
    }
}
