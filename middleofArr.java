/*
 * Write a function called middle that takes an array and 
 * returns a new array that contains all but the first and last elements.

myArray = [1, 2, 3, 4]
middle(myArray)  # [2,3]. 
 */

import java.util.Arrays;

public class middleofArr {
    public static int[] middle(int array[]){
        if(array.length<=2){
            return new int[0];
        }
        int middle []=new int[array.length-2];
        for(int i=1;i<array.length-1;i++){
            middle[i-1]=array[i];
        }
        return middle;
    }
    public static void main(String[] args) {
        int [] arr={10,20,30,45,18,12};
        System.out.println(Arrays.toString(middle(arr)));
        
    }

}
