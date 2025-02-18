
import java.util.Scanner;

public class functProduct {
    public static int product(int a, int b){
        int pro= a*b;
        return pro;
    }
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int a= input.nextInt();
        int b= input.nextInt();
        int pro=product(a, b);
        System.out.println(pro);
    }
}
