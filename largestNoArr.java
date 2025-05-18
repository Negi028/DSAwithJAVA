//largest number in array
public class largestNoArr {
    public static int findLargestElement(int array[]){//static used for not makinf new object for invoking the function directly access
        int max=array[0];
        for(int i =0;i<array.length;i++){
            if(array[i]>max){
                max=array[i];
            }
        }
        return  max;


    }
    public static void main(String[] args) {
        int [] arr= {10,20,45,65,10,85};
        int largestvalue=findLargestElement(arr);
        System.out.println("largest element is "+largestvalue);

      
  
}
}
