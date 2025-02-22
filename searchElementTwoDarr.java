//search user  given element in  2d-matrics and print their indices 
import java.util.Scanner;

public class searchElementTwoDarr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER ROWS AND COLUMS OF 2D-ARRAY: ");
        int rows=sc.nextInt();
        int cols=sc.nextInt();
        int searchEle[][]=new int[rows][cols];
        //INPUT 
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                searchEle[i][j]=sc.nextInt();
            }
        }
        System.out.println("ENTER NUMBER YOU WANT TO SEARCH : ");
        int searchElement=sc.nextInt();

        //for indices print check for loop and print it
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(searchEle[i][j]==searchElement){
                    System.out.println("these are the indices of your searched element : "+i+" "+j);
                }
            }
        }

    }
}
