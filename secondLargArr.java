public class secondLargArr {
    public static int secondLargestElement(int array[]){
        int firstLarge=array[0];
        int secondLarge=array[1];
        for(int i=0;i<array.length;i++){
            if(array[i]>firstLarge){
                secondLarge=firstLarge;//this is imp for this code firstly assign  firstlargest to second then update first largest
                firstLarge=array[i];
            }
            else if(array[i]>secondLarge && array[i]<firstLarge){
                secondLarge=array[i];
            }
        }
        return secondLarge;
    }
    public static void main(String[] args) {
        int arr[]={10,85,90,45,99};
        int secondLargest=secondLargestElement(arr);
        System.out.println("second largest element in array is "+secondLargest);
    }
}
