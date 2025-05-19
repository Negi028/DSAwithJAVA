public class sumOfElementsArr {
    
    public static int sumofelementsinarray(int array[]){
        int sum=0;
        for(int i=0;i<array.length;i++){
            sum=sum+array[i];
        }
        return sum;

    }
    public static void main(String[] args) {
        int arr[]={10,20,40,50,60};
        int sumOfElements=sumofelementsinarray(arr);
        System.out.println("sum of elements in array is "+sumOfElements);
        
    }
}
