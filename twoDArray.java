//user input two d array
import java.util.Scanner;

public class twoDArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("ENTER ROWS AND COLUMNS SIZE: ");
        int rows=sc.nextInt();
        int cols=sc.nextInt();

        int twodarr[][]=new int[rows][cols];
        
        //for input we will use nested loop due to two dimensions array
        for(int i=0;i<rows;i++){
            for(int j=0; j<cols;j++){
                twodarr[i][j]=sc.nextInt();
            }
        }

        //for output 

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(twodarr[i][j]+" ");
            }
            System.out.println();
        }
    } 

    
}
