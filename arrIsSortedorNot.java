
import java.util.Scanner;

//Take an array of numbers as input and check if it is an array sorted in ascending order.
//Eg : { 1, 2, 4, 7 } is sorted in ascending order.
//{3, 4, 6, 2} is not sorted in ascending order.

public class arrIsSortedorNot {
    public static void main(String[] args) {
        System.out.print("enter size of array : ");
        Scanner sc= new Scanner(System.in);
        int size=sc.nextInt();
        int numbers[]=new int[size];
        
        //for input 
        for(int i=0;i<numbers.length;i++){
            numbers[i]=sc.nextInt();
        }
        //for output is sorted or not 

        boolean isAscending= true;

        for(int i=0; i<size-1;i++){ 
            if(numbers[i]>numbers[i+1]){
                isAscending=false;
            }
           
        }
        if(isAscending==true){
            System.out.println("this array is sorted array ");
        }
        else{
            System.out.println("not a sorted array");
        }
    }
}
