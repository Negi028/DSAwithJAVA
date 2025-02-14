//buffer conversion of byte in float double etc,like space thats why we use next int for accessing data items
//space will ignore next input 
import java.util.Scanner;

public class input2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the number");
        int n= scanner.nextInt();
        int n2= scanner.nextInt();
        System.out.println("result"+n+n2);

        scanner.close();


    }
}
