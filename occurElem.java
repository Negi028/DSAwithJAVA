
import java.util.Scanner;

public class occurElem {
    public static int occurenceofElementArr(int array[]){
        int count=0;
        Scanner input=new Scanner(System.in);
        System.out.println("enter the element which you want to check no. of occurence ");
        int num=input.nextInt();

        for(int i=0;i<array.length;i++){
            if(array[i]==num){
                count++;
            }
        }
        return count;

    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the size of array ");
        int size=input.nextInt();
        int arr[]= new int [size];
        System.out.println("enter the elements of array : ");
        for(int i=0;i<size;i++){
            arr[i]=input.nextInt();
        }
       
        int noOFoccur=occurenceofElementArr(arr);
        System.out.println("no. of occurence of given element is "+noOFoccur);



        
    }
}
