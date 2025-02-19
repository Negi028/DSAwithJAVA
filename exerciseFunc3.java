
import java.util.Scanner;

//Write a program to enter the numbers till the 
//user wants and at the end it should 
//display the count of positive, negative and zeros entered. 

public class exerciseFunc3 {
    //this function will take user input and initially choice=1 then take user input
    public static void countPosNegZero(){
        Scanner input = new Scanner(System.in);
        int pos=0;
        int neg=0;
        int zero=0;
        int choice=1;
        while (choice==1){
        System.out.println("Enter number : ");
        int numb=input.nextInt();
        if(numb>0){
            pos++;
        }
        else if(numb<0){
            neg++;
        }
        else{
            zero++;
        }
        
        System.out.println("do you want to continue ? 1 for yes or 0 for no): ");
        choice=input.nextInt();
    }
    
    System.out.println("positive numbers :"+pos);
    System.out.println("Negative numbers : "+neg);
    System.out.println("zeros : "+zero);
 
}
    public static void main(String[] args) {
        
        countPosNegZero();

        
    }
}
