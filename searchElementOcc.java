public class searchElementOcc {
    static int[] sizeOfarray(int arr[],int index,int count,int search){
        if(index==arr.length){
            int result[]=new int[count];
            return result;
        }
        if(arr[index]==search){
            count++;
        }
        int result[]= sizeOfarray(arr, index+1, count, search);
        if(arr[index]==search){
            result[count-1]=index;
        }
        return result;

    }
    static int[] seachElementOcccurence(int arr[],int index,int search){
        return sizeOfarray(arr, index, index, search);


    }
    public static void main(String[] args) {
        int arr[]={10,20,50,40,50,60};
        int search=50;
        int index=0;
        int result[]=seachElementOcccurence(arr, index, search);
        for(int i=0;i<result.length;i++){
            System.out.println(result[i]);
        }
        
    }
}
