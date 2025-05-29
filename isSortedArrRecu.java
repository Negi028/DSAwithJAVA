public class isSortedArrRecu {
    static boolean isSortedArray(int[] arr,int index){
        if(arr[index]==arr.length-1){
            return true;
        }
        if(arr[index]>arr[index+1]){
            return false;
        }
        return isSortedArray(arr, index+1);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,5,4};
        System.out.println(isSortedArray(arr, 0)?"Sorted":"unsorted");
    }
}
