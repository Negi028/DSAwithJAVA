
import java.util.Scanner;

public class arrUserInput {
    public static void main(String[] args) {
        System.out.print("Enter size of array : ");
        Scanner sc= new Scanner(System.in);
        int size=sc.nextInt();
        int numbers[]= new int[size];
        //for input from user base case:less then size of array
        for(int i=0;i<size;i++){
            System.out.print("Element at index : "+i+" ");
            numbers[i]=sc.nextInt();  
        }
        //for accessing array elements
        for(int i=0;i<size;i++){
            System.out.println(numbers[i]);
        }
    }
}
