
import java.util.Scanner;

//Find the maximum & minimum number in an array of integers.
//FROM JAVA.LANG.PACKAGE integer.MAX-VALUE & integer.MIN_VALUE COnstant store max=(2^31)-1 annd min=-2^31 value
public class arrMaxMin {
    public static void main(String[] args) {
        System.out.println("enter size of array : ");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int num[]=new int[size];

        //input numbers from user 
        System.out.println(" enter numbers : ");
        for(int i=0;i<size;i++){ 
            num[i]=sc.nextInt();
        }
        //for accessing max and min value firstly initialize max and min value then compare to elements 
        int min=Integer.MAX_VALUE;//asssume that min has maxximum number then compare with smaller elemnts infinity
        int max=Integer.MIN_VALUE;//assume that max has minimum number then compare with larger elemtns and update -infinity

        for(int i=0;i<size;i++){ 
            if(num[i]>max){
                max=num[i];
            }
            if(num[i]<min){
                min=num[i];
            }
        }
        System.out.println("max number is : "+max);
        System.out.println("min number is : "+min);
        
    }
}
