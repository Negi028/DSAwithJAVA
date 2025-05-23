//arrrayList used when you dont know how much element will be used in list
import java.util.ArrayList;
import java.util.Scanner;

public class arrList {
    public static void main(String[] args) {
        ArrayList<Integer> even = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        int x;
        
        System.out.println("Enter numbers (type -1 to stop):");
        while ((x = input.nextInt()) != -1) {
            if (x % 2 == 0) {
                even.add(x);
            }
        }

        System.out.println("Even numbers are: " + even);
        input.close();//you also need to close the input scanner class
    }
}
