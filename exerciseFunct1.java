
import java.util.Scanner;

//user input : 3 numb make a function to print average
public class exerciseFunct1 {
    public static int average(int a, int b, int c){
        int avg= (a+b+c)/3;
        System.out.println(avg);
        return avg;
    }
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int a=input.nextInt();
        int b=input.nextInt();
        int c=input.nextInt();
        average(a, b, c);
    }
    
}
