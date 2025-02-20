
import java.util.Scanner;

public class arrSearchElement {
    public static void main(String[] args) {
        System.out.print("Enter size of array : ");
        Scanner sc= new Scanner(System.in);
        int size=sc.nextInt();
        int userArr[]=new int[size];

        //input from user element in array
        for(int i=0;i<size;i++){
            userArr[i]=sc.nextInt();
        }
        //which element you want to search
        System.out.print("enter element you want to search : ");
        int search=sc.nextInt();

        //output : index of search element 
        for(int i=0;i<size;i++){ 
            if(search==userArr[i]){
                System.out.println("index of searched element is : "+i);
            }
        }
    }
}
