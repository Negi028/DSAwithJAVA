
import java.util.Scanner;

//Take an array of names as 
//input from the user and 
//print them on the screen.

public class arrTakeNameUser {
    public static void main(String[] args) {
        System.out.print("ENTER SIZE OF ARRAY : ");
        Scanner sc= new Scanner(System.in);
        int size=sc.nextInt();
        String names[]=new String[size];

        //for input names : names.length=> size
        System.out.println("ENTER NAMES : ");
        for(int i=0;i<size;i++){
            names[i]=sc.nextLine();
        }
        System.out.println("USER NAMES ARE : ");
        //for accessing elements 
        for(int i=0;i<names.length;i++){
            System.out.println(names[i]);
        }

    }
    
}
