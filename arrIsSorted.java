public class arrIsSorted {
    public static boolean isSortedArray(int array[]){
        boolean isSorted=true;//assume array is sorted
        for(int i=0;i<array.length-1;i++){//this is because we need to compare element with 1 step ahead of element to remove exception bound
            if(array[i]>array[i+1]){
                isSorted=false;

            }

        }
        return isSorted;
    }
    public static void main(String[] args) {
        int arr[]={50,20,45,50,65};
        boolean issort=isSortedArray(arr);
        System.out.println("true for  sorted or false for unsorted   "+issort);
    }
}
