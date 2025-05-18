//reversing the array with use of function for enhancing reusability
public class reverseArr {
    public static int[] reverseArray(int array[]){
        int[] newarray= new int [array.length];
        for(int i=array.length-1;i>=0;i--){
            newarray[newarray.length-i-1]=array[i];

        }
        return newarray;


    }
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50};
        int rev[]=reverseArray(arr);
        for(int value:rev){
            System.out.print(value+" ");
        }

        
    }
}
