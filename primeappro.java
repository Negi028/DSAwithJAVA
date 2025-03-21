
import java.util.Scanner;

//for use when we know intial and final state
// while when we don t know the boundaries


public class primeappro {
    public static void main(String[] args) {
        int div=2;
        System.out.println("enter any number : ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        while(Math.sqrt(num)>0){
            if(num%div==0){
                System.out.println("composite number");
                div++;
                break;
            }
            else{
                System.out.println("prime number");
                break;
            }

        }

        
    }
}
