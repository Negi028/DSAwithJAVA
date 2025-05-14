public class array1 {
    public static void main(String[] args) {
        int count=1;
        int [] arr1= new int[8];
        //allocate number from 1 to till the size of array and display it on screen
        for(int i=0;i<arr1.length;i++){
            arr1[i]=count;
            count++;
        }
        //for display 
        for(int j=0;j<arr1.length;j++){
            System.out.print(arr1[j]+" ");
        }

    }
}
